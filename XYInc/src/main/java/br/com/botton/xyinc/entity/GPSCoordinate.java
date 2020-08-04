package br.com.botton.xyinc.entity;

public class GPSCoordinate {
	
	private Long x;
	private Long y;
	private Double max;
	
	public GPSCoordinate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GPSCoordinate(Long x, Long y, Double max) {
		super();
		this.x = x;
		this.y = y;
		this.max = max;
	}
	
	public Long getX() {
		return x;
	}
	public void setX(Long x) {
		this.x = x;
	}
	public Long getY() {
		return y;
	}
	public void setY(Long y) {
		this.y = y;
	}
	public Double getMax() {
		return max;
	}
	public void setMax(Double max) {
		this.max = max;
	}
	
	

}
