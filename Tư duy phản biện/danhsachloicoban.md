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
### 6. Nhóm Lỗi API & Tích hợp (API & Integration)
51. **Sai phương thức HTTP:** Dùng `GET` thay vì `POST` khi gửi dữ liệu nhạy cảm.
52. **Thiếu Header bắt buộc:** Quên truyền `Content-Type` hoặc `Authorization`.
53. **Cấu trúc JSON sai:** Dev thay đổi tên trường (vd: `user_id` thành `userId`) nhưng không báo cho phía nhận.
54. **API trả về lỗi 200 nhưng nội dung là lỗi:** Gây khó khăn cho việc xử lý logic ở Front-end.
55. **Quên giới hạn tốc độ (Rate Limiting):** Hệ thống sập vì một người dùng gọi API quá nhiều lần.
56. **Lỗi Timeout:** API của bên thứ 3 phản hồi quá chậm khiến hệ thống mình bị treo theo.
57. **Dữ liệu trả về quá thừa:** Trả về cả mật khẩu đã mã hóa hoặc thông tin cá nhân không cần thiết trong JSON.
58. **Thứ tự gọi API:** Trang web cố hiển thị dữ liệu từ API B trong khi API A (lấy ID) chưa chạy xong.
59. **Webhook thất bại:** Không có cơ chế gửi lại (retry) khi Webhook bị lỗi mạng.
60. **Phiên bản API (Versioning):** Cập nhật API mới làm hỏng các ứng dụng cũ vẫn đang dùng bản cũ.

---

### 7. Nhóm Lỗi Cơ sở dữ liệu (Database)
61. **Thiếu Index:** Truy vấn bảng có hàng triệu dòng mất hàng chục giây vì không đánh chỉ mục.
62. **Ràng buộc dữ liệu (Constraints):** Xóa một "Khách hàng" nhưng không xóa "Đơn hàng" liên quan, gây ra dữ liệu mồ côi.
63. **Kiểu dữ liệu không khớp:** Lưu chuỗi văn bản dài vào cột có giới hạn 255 ký tự (Gây lỗi *Data too long*).
64. **Kết nối không đóng:** Mỗi lần gọi hàm lại mở một kết nối mới đến DB làm cạn kiệt tài nguyên server.
65. **Transaction không hoàn chỉnh:** Trừ tiền người gửi thành công nhưng chưa cộng tiền người nhận đã bị lỗi giữa chừng.
66. **Hard-delete:** Xóa vĩnh viễn dữ liệu thay vì dùng `is_deleted`, dẫn đến không thể khôi phục khi nhầm lẫn.
67. **N+1 Query:** Một vòng lặp thực hiện hàng trăm truy vấn vào DB thay vì dùng một câu lệnh `JOIN`.
68. **Backup lỗi:** File backup bị hỏng hoặc chưa bao giờ được kiểm tra khả năng khôi phục.
69. **Lộ thông tin DB trong log:** Ghi cả câu lệnh SQL kèm mật khẩu vào file log hệ thống.
70. **Sai lệch dữ liệu (Data Inconsistency):** Hai bảng lưu cùng một thông tin nhưng giá trị lại khác nhau.

---

### 8. Nhóm Lỗi Logic Nghiệp vụ (Business Logic)
71. **Khuyến mãi chồng chéo:** Áp dụng nhiều mã giảm giá khiến đơn hàng có giá trị... âm hoặc bằng 0.
72. **Hết hạn sử dụng:** Voucher đã hết hạn nhưng vẫn dùng được nếu sửa giờ trên điện thoại.
73. **Số lượng tồn kho:** Hai người cùng mua sản phẩm cuối cùng vào một mili giây.
74. **Quy trình ngược:** Cho phép thanh toán trước khi xác nhận giỏ hàng.
75. **Lỗi logic làm tròn tiền:** Tổng tiền các sản phẩm con không khớp với tổng tiền hóa đơn.
76. **Phân trang (Pagination):** Khi sang trang 2 thì dữ liệu bị trùng lặp với trang 1 do có bản ghi mới chèn vào.
77. **Tìm kiếm không dấu:** Tìm "Tuấn" không ra "Tuan" (hoặc ngược lại) dù người dùng kỳ vọng thấy cả hai.
78. **Thông báo sai ngữ cảnh:** Hiện thông báo "Thành công" khi thực tế hành động đó thất bại.
79. **Lỗi logic độ tuổi:** Cho phép trẻ em 2 tuổi đăng ký tài khoản cần trên 18 tuổi.
80. **Trùng lặp dữ liệu:** Cho phép tạo 2 tài khoản trùng email do không check trùng lúc đăng ký.

---

### 9. Nhóm Lỗi Cấu hình & Môi trường (Environment & Config)
81. **Quên đổi môi trường:** Code chạy trên Local thì trỏ vào DB Test, nhưng lên Production vẫn trỏ vào DB Test.
82. **Thiếu biến môi trường (.env):** App sập ngay khi khởi động vì thiếu khóa bí mật.
83. **Phiên bản Node/Python/PHP khác nhau:** Local dùng bản mới, Server dùng bản cũ dẫn đến lỗi cú pháp.
84. **Phân quyền File/Folder:** Server không có quyền ghi file vào thư mục upload ảnh.
85. **Cấu hình Firewall:** Chặn nhầm cổng (port) khiến các dịch vụ không nói chuyện được với nhau.
86. **Hết hạn SSL:** Chứng chỉ bảo mật hết hạn làm trình duyệt cảnh báo "Trang web không an toàn".
87. **Hard-coded URL:** Dùng `localhost:3000` trong code thay vì dùng domain thực tế.
88. **Quên bật Gzip/Compression:** Website tải chậm vì file JS/CSS quá nặng.
89. **Cấu hình Mail Server:** Email kích hoạt tài khoản bị nhảy vào mục Spam hoặc không gửi được.
90. **Thiếu Log rotation:** File log phình to đến vài GB làm treo máy chủ.

---

### 10. Nhóm Lỗi "Người dùng thông thái" (Edge Cases)
91. **Tắt Javascript:** Người dùng tắt JS trên trình duyệt khiến mọi logic Front-end tê liệt.
92. **Ad-blocker:** Trình chặn quảng cáo xóa mất một số nút quan trọng vì đặt tên class là `ads-button`.
93. **Mạng chập chờn (Flaky network):** Đang gửi request thì mạng chuyển từ 4G sang Wifi.
94. **Thao tác cực nhanh:** Click liên tục vào nút "Mua hàng" 20 lần trong 1 giây.
95. **Copy-Paste ký tự lạ:** Paste biểu tượng cảm xúc (Emoji) hoặc ký tự Trung Quốc vào ô tên người dùng.
96. **Dùng trình duyệt ẩn danh:** Làm mất các dữ liệu lưu trong LocalStorage/Session.
97. **Nhấn nút "Back" liên tục:** Khiến ứng dụng quay lại những trang đáng lẽ đã bị khóa sau khi login.
98. **Dung lượng ảnh đại diện:** Upload ảnh có độ phân giải 8K khiến hệ thống xử lý ảnh bị treo.
99. **Tên file có dấu:** Upload file `tài liệu.pdf` lên server Linux không hỗ trợ tiếng Việt.
100. **Thay đổi URL thủ công:** User tự sửa `.../edit/5` thành `.../edit/9999` để dò tìm dữ liệu.

---

### 🚀 Lời khuyên cho Tester:
Đừng cố test hết 100 lỗi này cùng một lúc. Hãy chọn ra **Top 10 nguy cơ cao nhất** dựa trên tính chất dự án của bạn và tập trung vào đó trước. Một Tester giỏi là người biết lỗi nào có khả năng xảy ra cao nhất ở môi trường hiện tại!
### 💡 Cách sử dụng danh sách này:
* **Pre-code:** Đưa cho Dev xem để họ tránh.
* **Test Design:** Dùng làm ý tưởng để viết Test Case.
* **Review:** Dùng làm checklist khi review code của đồng nghiệp.
