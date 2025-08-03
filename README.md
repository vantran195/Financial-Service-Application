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
+ Trong file bao gồm:
- File frontend 'Bank' (chạy trong vscode)
- File backend 'project88' (chạy trong STS)
- File database 'project88_DB' (chạy trong MySQL)

Khởi chạy ứng dụng
npm install
npm start

Đăng ký tài khoản user:
- ấn đăng ký tài khoản và kiểm tra hòm thư email cá nhân để kích hoạt
  
Login với admin:
- username: admin
- password: 123456
