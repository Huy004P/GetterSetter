package advance.dev;

public class Person {
	 private String ten; 
     private int tuoi;
     private String diaChi;
     private String sdt;
     private double diemTB;
     
     
	public Person(String ten, int tuoi, String diaChi, String sdt, double diemTB) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.diemTB = diemTB;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		if (tuoi < 0);
		tuoi = 0;
		this.tuoi = tuoi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		if (diemTB <= 0);
		diemTB = 0;
		this.diemTB = diemTB;
	}
	@Override
	public String toString() {
		return "Person [ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", sdt=" + sdt + ", diemTB=" + diemTB
				+ "]";
	}
     
			
		}
     
 


