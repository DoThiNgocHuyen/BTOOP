class SinhViên {
    private// riêng tư
    String Tên;

    private// riêng tư
    int NămSinh;

    public int getNămSinh() {
        return this.NămSinh;
    }

    public void setNămSinh(int năm_sinh)
            throws Exception {
        // sinh viên thì tuổi phải trên 17
        int năm_hiện_tại = java.time.Year.now().getValue();
        int tuổi = năm_hiện_tại - năm_sinh;

        // System.out.printf("tuổi: %d", tuổi);
        if (tuổi < 18)
            // throw new Exception("Lỗi Nhập Liệu: Tuổi sv phải trên 17");
            throw new DiThuong("Lỗi Nhập Liệu: Tuổi sv phải trên 17");

        this.NămSinh = năm_sinh;
    }

    private float Điểm;

    // Hàm đọc dữ liệu: getter
    public String getTên() {
        // tiền định dạng dữ liệu, trước khi trả về
        // ví dụ: tiền tệ
        // 7000000 -> get() -> 7,000,000
        return this.Tên;
    }

    // Hàm ghi dữ liệu vào: setter
    public void setTên(String tên) {
        // tiền xử lý:
        // KIểm duyệt dữ liệu: valiate
        // if// nếu
        // (tên có vấn đề)
        // throw Exception("Dữ liệu không hợp lệ");

        this.Tên = tên;
    }
}