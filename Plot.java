public class Plot {
	
	private int xco;
	private int yco;
	private int width;
	private int depth;
	
	public Plot() {
		this.xco = 0;
		this.yco = 0;
		this.width = 1;
		this.depth = 1;
	}

	public Plot(Plot p) {
		this.xco = p.xco;
		this.yco = p.xco;
		this.width = p.width;
		this.depth = p.depth;

	}

	public Plot(int x, int y, int width, int depth) {
		this.xco = x;
		this.yco = y;
		this.width = width;
		this.depth = depth;
	}

	public void setX(int x) {
		this.xco = x;
	}
	
	public int getX() {
		return xco;
	}

	public void setY(int y) {
		this.yco = y;
	}
	
	public int getY() {
		return yco;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getDepth() {
		return depth;
	}

	
	public boolean overlaps(Plot plot) {
	    int trpX = plot.getX() + plot.getWidth(); 
	    int trpY = plot.getY() + plot.getDepth(); 
	    int tRX = xco + width; 
	    int tRY = yco + depth; 
	    int blX = xco; 
	    int blY = yco;
	    int bLPX = plot.getX(); 
	    int blpY = plot.getY(); 
	    
	    boolean overlaps1 = false;

	        if((blX < trpX) && (blY < trpY) && (bLPX< tRX) &&  (blpY < tRY)) {
	         overlaps1 = true;
	        }
	         else {
	         overlaps1=false;
	         }
	        return overlaps1;
	    }

	public boolean encompasses(Plot plot) {
        int tRX = xco + width; 
        int tRY = yco + depth; 
        int bLX = xco; 
        int bLY = yco;   
        int tRPX = plot.getX() + plot.getWidth(); 
        int tRPY= plot.getY() + plot.getDepth(); 
        int blpX= plot.getX(); 
        int bLPY= plot.getY(); 
        
        boolean encompasses1=false;
        
        if((bLX <= blpX) && (tRX >= tRPX) && (bLY <= bLPY) && (tRY >= tRPY)) {
            encompasses1=true;
        }
        else {
            encompasses1=false;
        }
        return encompasses1;
        }

	public String toString() {
		String str1 = "Upper left: (" + getX() + "," + getY()
		+ "); Width: " + getWidth() + " Depth: " + getDepth();

		return str1;
	}

}