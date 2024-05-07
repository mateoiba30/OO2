package ar.edu.unlp.info.oo2.ej24_TestDouble_;

public abstract class ProcessStep {
	
	private boolean result;

	public ProcessStep(boolean result) {
		this.result = result;
	}
	
	public void execute (MixingTank tank) {
		if (this.basicExecute(tank)) 
			this.setSucces();
		else
			this.setFailure();
	}
	
	private void setSucces() {
		this.result = true;
	}
	
	private void setFailure() {
		this.result = false;
	}
	
	public boolean isDone() {
		return this.result;
	}

	public abstract boolean basicExecute(MixingTank tank);
}
