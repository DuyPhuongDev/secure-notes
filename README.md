# Secure Notes App

## Giới thiệu

Dự án này là một ứng dụng web được xây dựng bằng Spring Boot và MySQL, sử dụng Docker để triển khai môi trường cơ sở dữ liệu. 
Ứng dụng này cung cấp các API để quản lý thông tin của người dùng, tích hợp xác thực nhiều yếu tố 2FA với Google Authenticator, oauth2 với Google và Github, reset password với MailService.

## Cài đặt

### 1. Clone repository từ GitHub

```bash
git clone https://github.com/DuyPhuongDev/spring-security.git
```

### 2. Thiết lập Docker cho MySQL

#### 2.1 Chạy một container MySQL bằng cách sử dụng Docker. 

```bash
docker run --name mysql-lts -e MYSQL_ROOT_PASSWORD=root -d mysql:lts
```
Lệnh này sẽ tạo và chạy một container mysql với `password: root` với phiên bản `mysql:lts`.

#### 2.2 Kết nối vào container MySQL:

```bash
docker exec -it mysql-lts mysql -uroot -p
```

Lệnh này sẽ đưa bạn vào giao diện dòng lệnh của MySQL, sau đó bạn sẽ được yêu cầu nhập mật khẩu (ở đây là `root`).

#### 2.3 Tạo cơ sở dữ liệu `securenotes`:

```sql
CREATE DATABASE securenotes;
```
### 3. Kiểm tra API
Ứng dụng sẽ chạy trên `http://localhost:8080`. Bạn có thể kiểm tra các API bằng cách sử dụng [Postman](https://www.postman.com/) hoặc công cụ tương tự.
