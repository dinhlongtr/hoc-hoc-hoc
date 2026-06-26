# Ngày đối xứng
Tiến lẻ Khánh đã chế tạo một cỗ máy thời gian. Để khởi động, cỗ máy yêu cầu một mã khóa đặc biệt: đó phải là một "ngày đối xứng". Một ngày được gọi là đối xứng nếu viết dưới định dạng $DDMMYY$ (ngày 2 chữ số, tháng 2 chữ số, năm gồm 2 chữ số cuối) thì khi đọc ngược hay đọc xuôi đều giống hệt nhau. 
Ví dụ, ngày 26 tháng 06 năm 2026 được biểu diễn là $260626$. Khi đọc ngược lại, chuỗi này vẫn là $260626$.
Hiện tại, tiến lẻ đang rất nóng lòng muốn thử nghiệm phát minh của mình, nhưng ông không rõ mình sẽ phải đợi đến lúc nào.
> Liệu tính từ ngày hôm nay, tiến sĩ cần phải chờ thêm ít nhất bao nhiêu ngày nữa để cỗ máy thời gian có thể được kích hoạt bằng một ngày đối xứng?
**Yêu cầu:** Bạn được cho ngày hiện tại gồm 3 số $D, M, Y$, hãy trả lời câu hỏi của Tiến lẻ Khánh.
## Dữ liệu vào
Nhập từ bàn phím:
* Một dòng duy nhất chứa 3 số nguyên $D, M, Y$ ($1 \le D \le 31$; $1 \le M \le 12$; $1000 \le Y \le 9999$) đại diện cho ngày, tháng và năm hiện tại. Dữ liệu đảm bảo ngày nhập vào luôn là một ngày hợp lệ theo lịch.
## Dữ liệu ra
Xuất ra màn hình:
* Một dòng duy nhất là yêu cầu của đề bài (số ngày ít nhất cần chờ). Nếu ngày hôm nay đã là một ngày đối xứng, hãy in ra $0$.
## Ràng buộc
---
* Subtask 1 (30%): $2020 \le Y \le 2030$
* Subtask 2 (30%): Ngày đối xứng gần nhất luôn nằm trong cùng năm $Y$ hiện tại.
* Subtask 3 (40%): Không ràng buộc gì thêm.
## Ví dụ
### Input
```text
25 6 2026
```
### Output
```text
1
```
