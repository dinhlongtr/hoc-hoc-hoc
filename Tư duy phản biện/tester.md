# 🛠️ Tư duy "Thám tử Bug": Phương pháp rèn luyện cho Tester

Để "đi trước Dev một bước", bạn cần rèn luyện bộ não theo 4 phương pháp tư duy đặc thù sau đây:

---

### 1. Tư duy "Happy Path là ảo ảnh" (Pessimistic Thinking)
Lập trình viên thường tập trung vào việc làm sao cho tính năng **chạy được**. Tester phải tập trung vào việc làm sao để nó **chết**.

* **Cách rèn luyện:** Với mỗi tính năng, hãy đặt câu hỏi: "Nếu mình làm điều ngớ ngẩn nhất ở đây, hệ thống sẽ thế nào?".
* **Dẫn chứng cụ thể:** * *Dev nghĩ:* "Người dùng sẽ nhập số tuổi vào ô này." 
    * *Tester tính trước:* Người dùng nhập số âm (-5), nhập chữ (abc), nhập số cực lớn (999999), hoặc bỏ trống rồi nhấn Enter liên tục. 
    * **Nguy cơ:** Tràn bộ nhớ, lỗi logic hiển thị hoặc sập server vì không xử lý ngoại lệ (exception).

### 2. Tư duy "Hiệu ứng cánh bướm" (Impact Analysis)
Một thay đổi nhỏ ở Module A có thể làm nổ tung Module Z.

* **Cách rèn luyện:** Vẽ sơ đồ luồng dữ liệu. Tập thói quen tự hỏi: "Dữ liệu từ đây sẽ đi đâu tiếp theo? Nó có ảnh hưởng đến những bên nào liên quan?".
* **Dẫn chứng cụ thể:** * *Sự cố:* Dev sửa định dạng ngày tháng từ `DD/MM/YYYY` thành `YYYY-MM-DD` cho một trang cá nhân.
    * *Tester tính trước:* Việc này có thể làm hỏng chức năng xuất báo cáo tài chính hoặc khiến các API của bên thứ ba không đọc được dữ liệu.
    * **Nguy cơ:** Lỗi hồi quy (Regression bugs) ở những tính năng tưởng chừng không liên quan.

### 3. Tư duy "Thanh tra hiện trường" (Boundary Value Analysis)
Lỗi thường không nằm ở giữa, nó nằm ở **vùng biên**.

* **Cách rèn luyện:** Luôn kiểm tra các giá trị sát nút. Lập trình viên rất hay nhầm lẫn giữa dấu `>` (lớn hơn) và `>=` (lớn hơn hoặc bằng).
* **Dẫn chứng cụ thể:**
    * *Tình huống:* Hệ thống chỉ cho phép người từ 18 tuổi trở lên đăng ký.
    * *Tester tính trước:* Test đúng tại 17.9 tuổi, đúng 18 tuổi và 18.1 tuổi.
    * **Nguy cơ:** Dev dùng sai toán tử so sánh khiến người đúng 18 tuổi vẫn bị từ chối hoặc người chưa đủ tuổi vẫn lọt qua.

### 4. Tư duy "Người dùng không biết gì" (Persona-based Testing)
Lập trình viên thường quá hiểu hệ thống nên họ thao tác rất "chuẩn". Bạn phải giả định mình là một người dùng lần đầu cầm máy.

* **Cách rèn luyện:** Sử dụng phương pháp **"Monkey Testing"** (Thử nghiệm ngẫu nhiên). Bấm loạn xạ, nhấn quay lại khi đang tải trang, tắt mạng đột ngột khi đang thanh toán.
* **Dẫn chứng cụ thể:**
    * *Tình huống:* Đang thanh toán đơn hàng.
    * *Tester tính trước:* Nhấn nút "Thanh toán" 10 lần liên tiếp (Double/Multiple click) hoặc bấm nút "Back" của trình duyệt ngay khi tiền vừa trừ.
    * **Nguy cơ:** Đơn hàng bị tạo trùng, người dùng bị trừ tiền 2 lần nhưng không nhận được hàng.

---

### 📋 Bảng Checklist "Dự đoán lỗi" nhanh cho Tester

| Vùng nguy cơ | Lỗi Dev thường mắc | Câu hỏi phản biện của Tester |
| :--- | :--- | :--- |
| **Dữ liệu đầu vào** | Quên kiểm tra ký tự đặc biệt | "Nếu mình paste cả một đoạn mã script vào đây thì sao?" |
| **Logic thời gian** | Sai múi giờ (Timezone) | "Nếu user ở London đặt hàng cho user ở VN thì ngày giờ hiện thế nào?" |
| **Giao diện (UI)** | Tràn chữ trên màn hình nhỏ | "Nếu tên người dùng dài 100 ký tự thì giao diện có nát không?" |
| **Phân quyền** | Quên chặn URL trực tiếp | "Nếu mình không đăng nhập mà copy link trang Admin dán vào thì có xem được không?" |

---

### 💡 Lời khuyên để phối hợp với Dev:
Thay vì nói *"Anh làm sai rồi"*, hãy dùng tư duy phản biện để nói: *"Em đang lo là nếu người dùng nhấn nút này 2 lần thì hệ thống mình sẽ xử lý thế nào nhỉ? Anh đã tính đến case này chưa?"*. Cách này giúp bạn vừa chuyên nghiệp, vừa giữ được hòa khí để cùng tạo ra sản phẩm tốt nhất.
