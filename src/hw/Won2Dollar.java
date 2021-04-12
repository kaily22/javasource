package hw;

public  class Won2Dollar extends Converter {
//
//   public Won2Dollar(double ratio) {
//   this.ratio = ratio;
//   }

	@Override
	protected double convert(double src) {
		return src/1200;
	}

	@Override
	protected String getSrcSTring() {
		return "원";
	}

	@Override
	protected String getDestStirng() {
		return "달러";
	}

}
