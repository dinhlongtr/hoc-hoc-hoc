# Lệnh rẽ biển
## Mở ra
Gắn tag mở
```
/tag @a[hasitem={item=trident,location=slot.weapon.mainhand}] add mo
```

Dùng không khí lấp đầy phần nước cần rẽ
```
/fill 194 62 291 198 40 335 air replace water
```
Dùng Structure_Void tạo thành 2 vách tường ngăn nước
```
/fill 199 62 291 199 40 335 structure_void replace water
```
--------------------------------------------------
## Đóng lại
Xóa tag (300)
```
/tag @a remove mo
```
Dùng không khí thay thế tường Structure_Void
```
/fill 193 62 291 219 48 335 air replace structure_void
```
Cho nước lấp lại
```
/fill 193 62 291 219 48 335 air replace structure_void
```
