package jdbc;

import java.util.List;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		EmpDAO dao = new EmpDAO();

		while (run) {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1.특정 사원 조회 | 2.전체 사원 조회  |3. 사원 입력 | 4.사원 수정 | 5. 정보 삭제  | 6. 종료");
			System.out.println("-------------------------------------------------------------------------------");

			System.out.println("번호 입력>>  ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("사원번호를 입력하세요 :");
				int empno = Integer.parseInt(sc.nextLine()); // 7521 or 7566.........

				// 출력문에 넣어라
				// System.out.println(dao.selectOne(empno));
				// 2번쨰 : 리턴하는 값 그대로 받기

				EmpVO vo = dao.selectOne(empno);
				if (vo != null) {
					System.out.println("empno : " +vo.getEmpno());
					System.out.println("ename : " +vo.getEname());
					System.out.println("job : " +vo.getJob());
					System.out.println("hiredate : " +vo.getHiredate());
					System.out.println("deptno : " +vo.getDeptno());

				} else {
					System.out.println("사원번호를 확인해 주세요");
				}
				break;

			case 2:
				List<EmpVO> list = dao.select();

				for (EmpVO vo1 : list) {
					System.out.print("empno : " +vo1.getEmpno()+"\t");
					System.out.print("empname : " +vo1.getEname()+"\t");
					System.out.print("job : " +vo1.getJob()+"\t");
					System.out.print("hiredate : " +vo1.getHiredate()+"\t");
					System.out.println("deptno : " +vo1.getDeptno());
				}
				break;

			case 3:

				System.out.println("\n사원 정보 입력");
				System.out.print("사원 번호 >>");
				empno = Integer.parseInt(sc.nextLine());
				System.out.print("사원명 >>");
				String ename = sc.nextLine();
				System.out.print("직무 >> ");
				String job = sc.nextLine();
				System.out.print("매니저 번호 >> ");
				int mgr = Integer.parseInt(sc.nextLine());
				System.out.print("급여 >>");
				int sal = Integer.parseInt(sc.nextLine());
				System.out.print("추가수당 >>");
				int comm = Integer.parseInt(sc.nextLine());
				System.out.print("부서 번호 >>");
				int deptno = Integer.parseInt(sc.nextLine());

				// int result = dao.insert(empno, ename, job, mgr, sal, comm, deptno);
				EmpVO vo1 = new EmpVO();
				vo1.setEmpno(empno);
				vo1.setEname(ename);
				vo1.setJob(job);
				vo1.setMgr(mgr);
				vo1.setSal(sal);
				vo1.setComm(comm);
				vo1.setDeptno(deptno);

				int result = dao.insert(vo1);
				System.out.println(result > 0 ? "입력성공" : "입력실패");
				break;

			case 4: // empno, comm(수정)

				System.out.println("\n사원 정보 수정");
				System.out.print(" 수정할 사원 번호 입력 >>");
				empno = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 추가수당 입력 >>");
				comm = Integer.parseInt(sc.nextLine());

				System.out.println(dao.update(comm, empno) > 0 ? "수정이 완료되었습니다." : "수정이 실패하였습니다.");
				break;
			case 5:
				System.out.println("\n 사원 번호 삭제");
				System.out.print("삭제할 사원 번호 입력 : ");
				empno = Integer.parseInt(sc.nextLine());
				System.out.print("삭제할 사원 이름 입력  ");
				ename = sc.nextLine();

				System.out.println(dao.delete(empno, ename) > 0 ? "삭제 성공" : "삭제 실패");
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}

		}

	}
}
