<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .dashboard {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f0f0f0;
        }

        .feed-container {
            display: flex;
            width: 80%;
            height: 80%;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .left-feed {
            flex: 3;
            border-right: 1px solid #ddd;
            display: flex;
            flex-direction: column;
        }

        .left-feed-top {
            padding: 20px;
            border-bottom: 1px solid #ddd;
        }

        .left-feed-bottom {
            flex: 1;
            padding: 20px;
        }

        .right-feed {
            flex: 1;
            padding: 20px;
        }

        .post-card {
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 8px;
            padding: 15px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        .post-header {
            display: flex;
            align-items: center;
            margin-bottom: 15px;
        }

        .post-avatar {
            width: 40px;
            height: 40px;
            border-radius: 50%;
            background-color: #1877f2;
            color: white;
            display: flex;
            align-items: center;
            justify-content: center;
            font-weight: bold;
            margin-right: 10px;
        }

        .post-author {
            font-weight: bold;
            font-size: 14px;
        }

        .post-content {
            margin-bottom: 15px;
            font-size: 14px;
            line-height: 1.5;
        }

        .post-actions {
            border-top: 1px solid #e4e6eb;
            padding-top: 10px;
            display: flex;
            justify-content: space-around;
        }

        .post-btn {
            background: none;
            border: none;
            color: #65676b;
            font-weight: 600;
            font-size: 13px;
            cursor: pointer;
            padding: 8px 16px;
            border-radius: 4px;
            transition: background-color 0.2s;
        }

        .post-btn:hover {
            background-color: #f2f3f5;
        }

        .post-btn.like {
            color: #1877f2;
        }
    </style>
</head>
<body>
    <div class="dashboard">

    <div class="feed-container">
        <div class="left-feed">
            <div class="left-feed-top">
                <h2>Welcome ${user.firstName}</h2>
            </div>

            <div class="left-feed-bottom">
                <div class="active-users">
                    <h3>Active Users</h3>
                    <ul>
                        <c:forEach var="activeUser" items="${activeUsers}">
                            <li>${activeUser}</li>
                        </c:forEach>
                    </ul>
                </div>

                <div class="post-feed-container">
                    <a href="/mvcmilan/post" target="_blank"><button>Create Post</button></a>
                </div>
                
            </div>

        </div>


        <div class="right-feed">


            <c:forEach var="post" items="${posts}">
                            <li>${activeUser}</li>

            <div class="post-card">
                <div class="post-header">
                    <div class="post-avatar">JD</div>
                    <div class="post-author">${post.username}</div>
                </div>
                <div class="post-content">
                    <p>${post.content}</p>
                </div>
                <div class="post-actions">
                    <button class="post-btn like">👍 Like</button>
                    <button class="post-btn">💬 Comment</button>
                    <button class="post-btn">📤 Share</button>
                </div>
            </div>

            </c:forEach>

        </div>
    </div>


</div>
</body>
</html>

