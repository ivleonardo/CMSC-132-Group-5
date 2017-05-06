package IO_Parsing;

public class Instruction{

	public boolean isFetching;
	public boolean isDecoding;
	public boolean isExecuting;
	public boolean isMemoryAccessing;
	public boolean iswritingBack;

	public Instruction(){
		this.isFetching=false;
		this.isDecoding=false;
		this.isExecuting=false;
		this.isMemoryAccessing=false;
		this.iswritingBack=false;
	}

	public void fetch(){
		this.isFetching = true;
	}

	public void decode(){
		this.isDecoding = true;
	}

	public void execute(){
		this.isExecuting = true;
	}

	public void memoryAccess(){
		this.isMemoryAccessing = true;
	}

	public void writeBack(){
		this.iswritingBack = true;
	}

}
