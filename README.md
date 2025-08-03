# Giới thiệu dự án
Tên dự án: Financial Service Application
Mô tả: Cổng ngân hàng đa người dùng hỗ trợ gửi tiền, chuyển khoản, quản lý tài khoản và lịch sử giao dịch.
Ngôn ngữ sử dụng: Java, JavaScript, SCSS

Tính năng chính:
Role user:
- Đăng nhập và đăng ký người dùng
- Gửi tiền vào tài khoản
- Chuyển tiền giữa các tài khoản
- Xem lịch sử giao dịch
- Quản lý thông tin tài khoản

Role employee (chỉ admin mới tạo được tài khoản):
- Sử dụng toàn bộ tính năng của user
- Có thể thay đổi thông tin cơ bản của khách hàng như email
- Xem lịch sử giao dịch, nạp tiền cho khách hàng và xem thông tin khách hàng

Role Admin:
- Sử dụng toàn bộ tính năng của user
- Sử dụng toàn bộ tính năng của employee
- có thể deactive account employee
- Đăng ký tài khoản employee
  
# Cài đặt & chạy dự án
Hướng dẫn để chạy dự án trên máy cá nhân:
1. Clone repository về máy và khởi chạy bằng VScode, MySQL và Spring Tool Suite
- Trong file bao gồm: file frontend 'Bank' và file backend 'project88'


Khởi chạy ứng dụng
npm start
