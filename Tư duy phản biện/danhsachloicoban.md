# 🚩 Danh sách 100+ Nguy cơ lỗi trong Lập trình (Phân loại theo Module)

Dưới đây là bảng tổng hợp các "tử huyệt" mà lập trình viên (Dev) thường bỏ quên. Một Tester giỏi sẽ nhìn vào đây để bắt bài trước khi Code được triển khai.

---

### 1. Nhóm Lỗi Dữ Liệu & Kiểu Dữ Liệu (Data & Types)
1. **Tràn số (Integer Overflow):** Giá trị vượt quá giới hạn của kiểu dữ liệu (vd: vượt quá 2,147,483,647).
2. **Lỗi làm tròn (Rounding Error):** Phép chia lấy dư hoặc làm tròn tiền tệ gây mất tiền khách hàng.
3. **Giá trị Null/Undefined:** Truy cập vào một biến chưa được khởi tạo (Lỗi kinh điển: *NullPointerException*).
4. **Sai định dạng ngày tháng:** Nhầm lẫn giữa `MM/DD` và `DD/MM`.
5. **Năm nhuận:** Quên không xử lý ngày 29/02.
6. **Múi giờ (Timezone):** Lưu giờ địa phương thay vì UTC, dẫn đến sai lệch khi hiển thị ở quốc gia khác.
7. **Đơn vị đo lường:** Nhầm lẫn giữa km và dặm, kg và pound.
8. **Ký tự đặc biệt:** Không xử lý dấu nháy đơn `'`, nháy kép `"`, dấu xẹt `/` trong chuỗi.
9. **Dữ liệu rác (Garbage Data):** Cho phép nhập khoảng trắng ở đầu hoặc cuối chuỗi.
10. **Lỗi bảng mã (Encoding):** Hiển thị lỗi font chữ có dấu (UTF-8 vs Latin-1).

---

### 2. Nhóm Lỗi Logic & Thuật Toán (Logic & Algorithm)
11. **Vòng lặp vô tận (Infinite Loop):** Điều kiện thoát vòng lặp không bao giờ xảy ra.
12. **Lỗi "Off-by-one":** Lặp thừa hoặc thiếu 1 lần (dùng `<` thay vì `<=`).
13. **Điều kiện ngược:** Dùng `if (A)` trong khi đúng ra phải là `if (!A)`.
14. **Quên trường hợp `else`:** Chỉ xử lý trường hợp đúng, bỏ qua trường hợp sai.
15. **Ưu tiên toán tử:** Nhầm lẫn thứ tự tính toán `2 + 3 * 4` thành `(2 + 3) * 4`.
16. **Cập nhật trạng thái sai:** Bấm nút "Gửi" xong nhưng không vô hiệu hóa nút, dẫn đến gửi trùng.
17. **Race Condition:** Hai luồng dữ liệu cùng ghi vào một file một lúc gây hỏng file.
18. **Deadlock:** Hai tiến trình chờ nhau mãi mãi, làm treo hệ thống.
19. **Lỗi đệ quy quá sâu:** Gây ra lỗi *Stack Overflow*.
20. **Xử lý bất đồng bộ (Async/Await):** Dữ liệu chưa về đã đem đi hiển thị.

---

### 3. Nhóm Lỗi Giao Diện & Trải Nghiệm (UI/UX)
21. **Tràn chữ (Text Overlap):** Chữ quá dài đè lên icon hoặc nhảy xuống dòng làm nát layout.
22. **Mất phản hồi (Unresponsive):** Nhấn nút mà không có loading, người dùng tưởng máy treo.
23. **Sai tỷ lệ ảnh:** Ảnh bị bóp méo khi thay đổi kích thước màn hình.
24. **Lỗi trình duyệt cũ:** Chạy tốt trên Chrome nhưng lỗi trên Safari hoặc IE.
25. **Hard-coded text:** Quên không dịch một vài từ sang ngôn ngữ khác (English lẫn tiếng Việt).
26. **Phím Enter:** Nhấn Enter trong form không tự động submit.
27. **Mất dữ liệu khi xoay màn hình:** Đang nhập liệu trên mobile, xoay ngang máy là mất sạch.
28. **Tab Index:** Nhấn phím Tab nhưng con trỏ nhảy lung tung không theo thứ tự.
29. **Z-index:** Menu bị các banner hoặc quảng cáo đè lên trên.
30. **Độ tương phản thấp:** Chữ xám trên nền trắng khiến người già không đọc được.

---

### 4. Nhóm Lỗi Bảo Mật (Security)
31. **SQL Injection:** Cho phép user nhập code SQL vào ô tìm kiếm để hack database.
32. **XSS (Cross-Site Scripting):** Chèn đoạn mã Javascript độc hại vào phần bình luận.
33. **Lộ thông tin nhạy cảm:** Hiện lỗi hệ thống chi tiết (stack trace) cho người dùng xem.
34. **Mật khẩu lưu dạng text:** Không mã hóa mật khẩu trong database.
35. **ID dễ đoán:** Link profile là `user/1`, chỉ cần sửa thành `user/2` là xem được của người khác.
36. **Hết hạn Token:** Đang làm việc thì bị đá ra ngoài mà không thông báo.
37. **Upload file độc hại:** Cho phép upload file `.exe` hoặc `.php` lên server ảnh.
38. **Cấp quyền quá đà:** Nhân viên bán hàng lại có quyền xóa tài khoản admin.
39. **Không giới hạn số lần đăng nhập:** Cho phép hacker thử mật khẩu hàng triệu lần (Brute force).
40. **Lộ API Key:** Dev lỡ tay đẩy mã bí mật lên GitHub công khai.

---

### 5. Nhóm Lỗi Hệ Thống & Hiệu Năng (System & Performance)
41. **Rò rỉ bộ nhớ (Memory Leak):** Ứng dụng càng dùng càng chậm và tốn RAM.
42. **Connection Leak:** Mở kết nối database mà quên đóng.
43. **File quá lớn:** Upload ảnh 20MB làm treo trình duyệt.
44. **Hết dung lượng đĩa cứng:** Log ghi quá nhiều làm server đầy ổ cứng.
45. **Cache không cập nhật:** Đã sửa giá sản phẩm nhưng khách vẫn thấy giá cũ do cache.
46. **Dependency lỗi:** Thư viện bên thứ ba bị update và làm hỏng code hiện tại.
47. **Tải chậm (High Latency):** Trang web tải quá 3 giây khiến user bỏ đi.
48. **Lỗi mạng:** Không xử lý trường hợp rớt mạng đột ngột khi đang tải dữ liệu.
49. **Tốn pin:** Ứng dụng chạy ngầm quá nhiều tác vụ không cần thiết.
50. **Xung đột phiên bản:** Máy Dev chạy được nhưng máy Client thiếu thư viện nên lỗi.

---

### 💡 Cách sử dụng danh sách này:
* **Pre-code:** Đưa cho Dev xem để họ tránh.
* **Test Design:** Dùng làm ý tưởng để viết Test Case.
* **Review:** Dùng làm checklist khi review code của đồng nghiệp.
