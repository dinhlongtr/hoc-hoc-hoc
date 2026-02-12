# 🚀 Chuyển từ "Tìm lỗi" sang "Kiểm soát chất lượng"

Khi bạn đã có 100 nguy cơ trong đầu, hãy rèn luyện cách biến chúng thành hành động thực tế thông qua 3 kỹ năng bổ trợ sau:

---

### 1. Kỹ năng Viết "Bug Report" Thuyết Phục
Một lỗi chỉ thực sự được giải quyết nhanh khi bạn mô tả nó đủ rõ ràng.
* **Tiêu đề:** Ngắn gọn + Hành động + Kết quả (Vd: [Payment] - Nhấn 2 lần nút Thanh toán gây trừ tiền đôi).
* **Các bước tái hiện (Steps to Reproduce):** Càng chi tiết càng tốt.
* **Kết quả mong đợi (Expected Result):** Phải dựa trên logic nghiệp vụ, không dựa trên cảm tính.

### 2. Kỹ năng Đánh giá Mức độ Nghiêm trọng (Priority & Severity)
Tư duy phản biện giúp bạn biết lỗi nào cần sửa ngay, lỗi nào có thể chờ.
* **Blocker:** Sập hệ thống, không thể test tiếp (Ưu tiên số 1).
* **Critical:** Mất dữ liệu, lỗi bảo mật.
* **Major:** Chức năng chính không hoạt động theo đúng logic.
* **Minor/Trivial:** Lỗi hiển thị, sai chính tả, lệch pixel.

### 3. Kỹ năng "Hậu kiểm" (Retest & Regression)
Đừng bao giờ tin khi Dev nói: "Anh sửa xong rồi, không ảnh hưởng gì đâu".
* Hãy dùng kỹ năng **Impact Analysis** (Phân tích ảnh hưởng) để kiểm tra những vùng xung quanh lỗi đó. 
* *Dẫn chứng:* Sửa lỗi hiển thị tên người dùng ở Trang chủ? Hãy kiểm tra luôn cả trang Cá nhân và trang Hóa đơn.

---

### 💡 Bài tập nhỏ để rèn luyện "mắt thám tử"

Hãy thử nhìn vào một **Form Đăng ký** bất kỳ và tự trả lời nhanh:
1. Nếu mình paste 1 chương của truyện Harry Potter vào ô "Tên", hệ thống có cháy RAM không?
2. Nếu mình dùng email `test@gmail.com` (viết thường) và `TEST@gmail.com` (viết hoa), nó có coi là 2 người khác nhau không?
3. Nếu mình nhấn nút "Đăng ký" rồi rút dây mạng ra ngay lập tức, dữ liệu sẽ trôi về đâu?

---

> **Châm ngôn của Tester phản biện:** "Trái tim của một người bạn, nhưng bộ não của một kẻ thù." 
> Bạn tìm lỗi vì bạn muốn sản phẩm tốt hơn, chứ không phải vì bạn ghét người viết ra nó.
