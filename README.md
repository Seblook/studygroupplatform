# Study Group Platform

A full-stack web app that matches FIU students based on course schedules and availability.

## 🛠 Tech Stack
- Backend: Java (Spring Boot, JPA)
- Scheduling Logic: Python 3
- Auth: JWT Placeholder (no token handling yet)
- Frontend: React (structure scaffolded)
- Infra: Docker-ready

## 📦 Backend Structure
- `/auth/register` - Register new users
- `/auth/login` - Login endpoint
- `/match/run` - Call Python matcher (script-based)

## 🐍 Matchmaker
- Found in `/scripts/matchmaker.py`
- Groups students by matching courses and times

## 🔧 Run Locally
1. Start backend:
```bash
cd backend
./mvnw spring-boot:run
```

2. Run matcher manually (test):
```bash
python3 scripts/matchmaker.py
```

## 🚧 To Do
- Build full JWT security
- Connect frontend React UI
- Persist users via JPA repository
