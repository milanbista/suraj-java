<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modern To-Do Dashboard (Editable Status)</title>

    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700;800&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/remixicon@4.2.0/fonts/remixicon.css" rel="stylesheet">

    <style>
        /* --- CSS STYLES START HERE --- */

        /* --- Global Variables (Color Palette) --- */
        :root {
            --color-primary: #5A7BFC;      /* Accent Blue */
            --color-primary-dark: #4562E6; /* Darker Blue for hover */
            --color-background: #F4F7FB;   /* Light Background */
            --color-card: #FFFFFF;         /* Card Background White */
            --color-text: #2C3E50;         /* Dark Text */
            --color-text-light: #7F8C8D;   /* Light Grey Text */

            --status-todo: #E74C3C;        /* Red for To Do */
            --status-doing: #F39C12;       /* Orange for Doing */
            --status-done: #2ECC71;        /* Green for Done */
            --color-logout: #E74C3C;       /* Red for Logout button */
            --color-save: #00B894;         /* Green for Save button */

            --shadow-light: 0 6px 20px rgba(0, 0, 0, 0.08);
            --shadow-hover: 0 10px 25px rgba(0, 0, 0, 0.15);
        }

        /* --- Base Styling and Modern Reset --- */
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: 'Poppins', sans-serif;
            background-color: var(--color-background);
            color: var(--color-text);
            line-height: 1.6;
            display: flex;
            justify-content: center;
            align-items: flex-start;
            padding: 50px 20px;
            min-height: 100vh;
        }

        /* --- Dashboard Container --- */
        .dashboard {
            width: 100%;
            max-width: 1000px;
            background: var(--color-card);
            border-radius: 20px;
            box-shadow: var(--shadow-light);
            padding: 50px 40px;
        }

        /* --- Header & Greeting --- */
        .dashboard-header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 40px;
            padding-bottom: 25px;
            border-bottom: 1px solid #ECF0F1;
        }

        .user-greeting p {
            font-size: 1.1rem;
            color: var(--color-text-light);
            font-weight: 500;
        }

        .user-greeting h1 {
            font-size: 2.6rem;
            font-weight: 800;
            color: var(--color-text);
            margin-top: 5px;
        }

        /* --- Action Buttons Container --- */
        .action-buttons {
            display: flex;
            gap: 15px;
            align-items: center;
        }

        /* --- Button Styling --- */
        .btn {
            padding: 12px 20px;
            border: none;
            border-radius: 10px;
            font-size: 1rem;
            font-weight: 600;
            cursor: pointer;
            transition: all 0.3s ease;
            display: flex;
            align-items: center;
            text-decoration: none;
        }

        .btn i {
            margin-right: 8px;
            font-size: 1.2rem;
        }

        .btn-primary {
            background-color: var(--color-primary);
            color: var(--color-card);
            box-shadow: 0 4px 10px rgba(90, 123, 252, 0.4);
        }

        .btn-primary:hover {
            background-color: var(--color-primary-dark);
            box-shadow: 0 6px 15px rgba(90, 123, 252, 0.6);
            transform: translateY(-2px);
        }

        .btn-secondary {
            background-color: transparent;
            color: var(--color-text-light);
            padding: 10px;
            border-radius: 50%;
        }
        .btn-secondary i {
            margin: 0;
            font-size: 1.5rem;
        }

        .btn-secondary:hover {
            background-color: #E0E6F0;
            color: var(--color-primary);
            transform: scale(1.1);
        }

        .btn-logout {
            background-color: transparent;
            color: var(--color-logout);
            font-weight: 700;
            padding: 10px 15px;
            border-radius: 8px;
        }

        .btn-logout:hover {
            background-color: rgba(231, 76, 60, 0.1);
        }

        /* --- Task Summary Bar --- */
        .task-summary-bar {
            display: flex;
            justify-content: flex-start;
            gap: 40px;
            margin-top: 20px;
            font-size: 0.95rem;
            font-weight: 600;
            color: var(--color-text-light);
        }
        .task-summary-bar span {
            display: flex;
            align-items: center;
        }
        .task-summary-bar strong {
            font-size: 1.2rem;
            font-weight: 700;
            color: var(--color-text);
            margin-right: 5px;
        }

        /* --- Main Task List --- */
        .task-list-container h2 {
            font-size: 1.6rem;
            font-weight: 600;
            margin-top: 30px;
            margin-bottom: 20px;
            color: var(--color-text);
        }

        .task-list {
            list-style: none;
            padding: 0;
            display: grid;
            gap: 15px;
        }

        .task-item {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 25px;
            background: #FFFFFF;
            border-radius: 10px;
            box-shadow: var(--shadow-light);
            transition: all 0.3s ease;
            border-left: 5px solid transparent;
        }

        .task-item:hover {
            box-shadow: var(--shadow-hover);
            transform: translateY(-2px);
        }

        .task-info {
            flex-grow: 1; /* Allows task info to take available space */
            margin-right: 20px;
        }

        .task-info h3 {
            font-size: 1.15rem;
            font-weight: 600;
            margin-bottom: 5px;
        }

        .task-deadline {
            font-size: 0.9rem;
            color: var(--color-text-light);
            font-weight: 400;
        }

        .task-deadline i {
            margin-right: 5px;
        }

        /* --- Task Actions Group (Dropdown & Save Button) --- */
        .task-actions {
            display: flex;
            align-items: center;
            gap: 10px;
        }

        .task-status-dropdown {
            padding: 8px 10px;
            border: 1px solid #DCE1E7;
            border-radius: 8px;
            font-family: 'Poppins', sans-serif;
            font-size: 0.9rem;
            font-weight: 500;
            background-color: #f7f7f7;
            cursor: pointer;
            transition: border-color 0.2s;
        }

        /* Dropdown Colors based on selected state (using JavaScript will be needed for dynamic color) */
        .status-todo .task-status-dropdown { color: var(--status-todo); }
        .status-doing .task-status-dropdown { color: var(--status-doing); }
        .status-done .task-status-dropdown { color: var(--status-done); }

        .task-status-dropdown:focus {
            outline: none;
            border-color: var(--color-primary);
            box-shadow: 0 0 0 3px rgba(90, 123, 252, 0.2);
        }

        .btn-save-status {
            padding: 8px 15px;
            background-color: var(--color-save);
            color: white;
            border-radius: 8px;
            font-size: 0.9rem;
            font-weight: 600;
            transition: background-color 0.2s;
        }

        .btn-save-status:hover {
            background-color: #00A382;
        }


        /* --- Status Border Colors --- */
        .status-todo { border-left-color: var(--status-todo); }
        .status-doing { border-left-color: var(--status-doing); }
        .status-done { border-left-color: var(--status-done); opacity: 0.9; }
        .status-done .task-info h3 { text-decoration: line-through; color: var(--color-text-light); }

        /* --- Responsive Adjustments --- */
        @media (max-width: 768px) {
            .dashboard { padding: 30px 20px; }
            .dashboard-header { flex-direction: column; align-items: flex-start; }
            .user-greeting h1 { font-size: 2rem; }
            .action-buttons { margin-top: 20px; width: 100%; justify-content: space-between; }
            .btn-primary { flex-grow: 1; }
            .task-summary-bar { flex-direction: column; gap: 10px; }

            .task-item {
                flex-direction: column;
                align-items: flex-start;
                padding: 15px;
            }

            .task-info {
                margin-bottom: 10px;
                margin-right: 0;
                width: 100%;
            }

            .task-actions {
                width: 100%;
                justify-content: space-between;
            }
            .task-status-dropdown {
                flex-grow: 1;
            }
        }
        /* --- CSS STYLES END HERE --- */
    </style>

    <script>
        // Simple JavaScript function to handle the Save action
        function saveTaskStatus(taskId) {
            const dropdown = document.getElementById(taskId);
            const newStatus = dropdown.value;
            const taskItem = dropdown.closest('.task-item');

            alert(`Task ${taskId}: Status updated to "${newStatus}"! (In a real app, this would save to a database)`);

            // Optional: Update the card's visual styling immediately after "save"
            // Remove all status classes
            taskItem.classList.remove('status-todo', 'status-doing', 'status-done');

            // Add the new status class
            taskItem.classList.add(`status-${newStatus.toLowerCase().replace(' ', '-')}`);
        }
    </script>
</head>
<body>
    <div class="dashboard">
        <header class="dashboard-header">
            <div class="user-greeting">
                <p>Hello, **Alice**!</p>
                <h1>Project Dashboard</h1>
            </div>

            <div class="action-buttons">
                <button class="btn btn-primary" onclick="alert('Open New Task Form!');">
                    <i class="ri-add-line"></i> New Task
                </button>
                <button class="btn btn-secondary" onclick="window.location.reload();">
                    <i class="ri-refresh-line"></i>
                </button>
                <button class="btn btn-logout" onclick="alert('Logging out...');">
                    <i class="ri-logout-box-r-line"></i> Logout
                </button>
            </div>
        </header>

        <div class="task-summary-bar">
            <span><strong>5</strong> Total Tasks</span>
            <span><strong>3</strong> Pending</span>
            <span><strong>2</strong> Completed</span>
        </div>

        <main class="task-list-container">
            <h2>Current Focus</h2>

            <ul class="task-list">

                <li class="task-item status-todo">
                    <div class="task-info">
                        <h3>Finalize Proposal Draft</h3>
                        <p class="task-deadline"><i class="ri-calendar-line"></i> Deadline: **Today, 4 PM**</p>
                    </div>
                    <div class="task-actions">
                        <select id="task-1" class="task-status-dropdown">
                            <option value="todo" selected>To Do</option>
                            <option value="doing">Doing</option>
                            <option value="done">Done</option>
                        </select>
                        <button class="btn-save-status" onclick="saveTaskStatus('task-1')">Save</button>
                    </div>
                </li>

                <li class="task-item status-doing">
                    <div class="task-info">
                        <h3>Implement API Endpoint for Users</h3>
                        <p class="task-deadline"><i class="ri-calendar-line"></i> Deadline: **Dec 20**</p>
                    </div>
                    <div class="task-actions">
                        <select id="task-2" class="task-status-dropdown">
                            <option value="todo">To Do</option>
                            <option value="doing" selected>Doing</option>
                            <option value="done">Done</option>
                        </select>
                        <button class="btn-save-status" onclick="saveTaskStatus('task-2')">Save</button>
                    </div>
                </li>

                <li class="task-item status-done">
                    <div class="task-info">
                        <h3>Configure CI/CD Pipeline</h3>
                        <p class="task-deadline"><i class="ri-calendar-line"></i> Deadline: **Yesterday**</p>
                    </div>
                    <div class="task-actions">
                        <select id="task-3" class="task-status-dropdown">
                            <option value="todo">To Do</option>
                            <option value="doing">Doing</option>
                            <option value="done" selected>Done</option>
                        </select>
                        <button class="btn-save-status" onclick="saveTaskStatus('task-3')">Save</button>
                    </div>
                </li>

                <li class="task-item status-todo">
                    <div class="task-info">
                        <h3>Review Junior Developer's PR</h3>
                        <p class="task-deadline"><i class="ri-calendar-line"></i> Deadline: **End of Week**</p>
                    </div>
                    <div class="task-actions">
                        <select id="task-4" class="task-status-dropdown">
                            <option value="todo" selected>To Do</option>
                            <option value="doing">Doing</option>
                            <option value="done">Done</option>
                        </select>
                        <button class="btn-save-status" onclick="saveTaskStatus('task-4')">Save</button>
                    </div>
                </li>

                 <li class="task-item status-done">
                    <div class="task-info">
                        <h3>Set up Cloud Environment</h3>
                        <p class="task-deadline"><i class="ri-calendar-line"></i> Deadline: **Dec 10**</p>
                    </div>
                    <div class="task-actions">
                        <select id="task-5" class="task-status-dropdown">
                            <option value="todo">To Do</option>
                            <option value="doing">Doing</option>
                            <option value="done" selected>Done</option>
                        </select>
                        <button class="btn-save-status" onclick="saveTaskStatus('task-5')">Save</button>
                    </div>
                </li>

            </ul>
        </main>
    </div>
</body>
</html>