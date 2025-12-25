# GitHub 仓库设置指南

## 已完成的工作

✅ Git 仓库已初始化  
✅ Git 用户信息已配置（邮箱：1409617572@qq.com，用户名：simon3191）  
✅ 代码已提交到本地仓库  

## 下一步：推送到 GitHub

### 方法一：在 GitHub 网站创建仓库（推荐）

1. **登录 GitHub**
   - 访问 https://github.com
   - 使用你的账户登录（simon3191）

2. **创建新仓库**
   - 点击右上角的 "+" 号，选择 "New repository"
   - 仓库名称建议：`fanmaisystem` 或 `salesproj`
   - 描述：`华信贩卖系统 - Spring Boot销售管理系统`
   - 选择 **Public** 或 **Private**（根据你的需要）
   - ⚠️ **不要**勾选 "Initialize this repository with a README"（因为我们已经有了）
   - 点击 "Create repository"

3. **推送代码到 GitHub**
   
   在项目目录下执行以下命令（将 `YOUR_USERNAME` 替换为你的GitHub用户名，`REPO_NAME` 替换为你创建的仓库名）：

   ```bash
   cd D:\salesproj
   git remote add origin https://github.com/simon3191/REPO_NAME.git
   git branch -M main
   git push -u origin main
   ```

   例如，如果仓库名是 `fanmaisystem`：
   ```bash
   git remote add origin https://github.com/simon3191/fanmaisystem.git
   git branch -M main
   git push -u origin main
   ```

### 方法二：使用 SSH（如果已配置SSH密钥）

```bash
cd D:\salesproj
git remote add origin git@github.com:simon3191/REPO_NAME.git
git branch -M main
git push -u origin main
```

## 认证说明

如果推送时要求输入用户名和密码：
- **用户名**：simon3191
- **密码**：需要使用 **Personal Access Token**（不是GitHub登录密码）

### 如何创建 Personal Access Token

1. 登录 GitHub
2. 点击右上角头像 → **Settings**
3. 左侧菜单选择 **Developer settings**
4. 选择 **Personal access tokens** → **Tokens (classic)**
5. 点击 **Generate new token (classic)**
6. 填写 Note（如：`fanmaisystem`）
7. 选择过期时间
8. 勾选权限：至少勾选 `repo`（完整仓库权限）
9. 点击 **Generate token**
10. **复制生成的token**（只显示一次，请保存好）
11. 推送代码时，密码处输入这个token

## 验证推送

推送成功后，访问你的GitHub仓库页面，应该能看到所有代码文件。

## 常用 Git 命令

```bash
# 查看状态
git status

# 添加文件
git add .

# 提交更改
git commit -m "提交说明"

# 推送到GitHub
git push

# 拉取最新代码
git pull

# 查看提交历史
git log
```

## 注意事项

1. 如果遇到推送错误，确保GitHub仓库已创建
2. 确保远程仓库地址正确
3. 如果使用HTTPS，需要Personal Access Token而不是密码
4. 建议定期提交和推送代码

## 问题排查

### 问题：`remote origin already exists`
**解决**：先删除再添加
```bash
git remote remove origin
git remote add origin https://github.com/simon3191/REPO_NAME.git
```

### 问题：`failed to push some refs`
**解决**：先拉取远程代码
```bash
git pull origin main --allow-unrelated-histories
git push -u origin main
```

---

**提示**：如果遇到任何问题，可以随时询问！

