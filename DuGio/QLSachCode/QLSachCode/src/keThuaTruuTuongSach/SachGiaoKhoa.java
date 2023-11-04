package keThuaTruuTuongSach;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach
{
	private boolean tinhTrang;
	private final double GIAMGIASACHCU=0.5f;
	
	@Override
	 double thanhTien() {
		// TODO Auto-generated method stub
		double tien=0;
		//noi dung viet sau
		if(isTinhTrang())
			tien= getSoLuong()*getDonGia();
		else //sách cũ 

			tien=getSoLuong()*getDonGia()*GIAMGIASACHCU;
		return 0;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXB,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		this.tinhTrang = tinhTrang;
	}

	public SachGiaoKhoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXB) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//mong đợi ma sach, ngay, don gia, so luong
		String trangThai= isTinhTrang()?"mới":"cũ";
		return super.toString()+ String.format("%-30s|",trangThai);
	}

	
}
