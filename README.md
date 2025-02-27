# MyBatis - Intro

> 第 1 章作业 2024-02-25
> 
> 202258501214 张喜庆

## 作业要求

搭建第一个 mybatis 程序，查询学生信息表 student 所有记录  
数据库名： **homework**  
表名： **student**（学生信息表）  
字段 2 个：
- no    学号 字符串 10位 主键
- name  姓名 字符串 8位  非空

要求用 mybatis 框架，mysql 数据库，查询该表的所有记录并输出，同时在控制台打印出日志信息

## 项目特性

- **Java 8 项目**：使用 Maven 构建，由 IntelliJ IDEA 创建的初始空项目。
- **MyBatis 集成**：在项目中引入 MyBatis 依赖，并配置 `mybatis-config.xml` 与 `StudentMapper.xml` 来操作数据库。
- **Log4J2 日志**：在 `pom.xml` 中引入 Log4J2 依赖，并通过修改 MyBatis 配置与创建 `log4j2.xml` 文件，实现了在控制台输出 MyBatis 日志信息。
> 项目引入的 Log4J 2 使用的配置文件格式为 **xml**，而不是课堂上 Log4J 1 的 **properties**
- **Demo 功能**：通过主入口类 `com.hsipig.Main` 演示从 `homework` 数据库的 `student` 表中查询数据并输出。

## 技术栈

- Java 8
- Maven
- MyBatis
- Log4J2
- MySQL

## 项目结构

```
├── pom.xml                             # Maven 配置文件（包含 MyBatis、Log4J2 等依赖）
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/hsipig/Main.java    # Java 源代码（包含 com.hsipig.Main 主入口类）
│   │   └── resources
│   │       ├── mybatis-config.xml      # MyBatis 配置文件
│   │       ├── StudentMapper.xml       # MyBatis Mapper 文件（针对 student 表）
│   │       └── log4j2.xml              # Log4J2 配置文件
└── README.md                           # 本文档
```

## 环境配置与运行步骤

1. **克隆项目并进入目录**：
   ```bash
   git clone https://github.com/ChHsiching/web-framework-assignments.git
   cd your-assignment-folder
   ```

2. **配置数据库**：
    - 运行 `src/main/resources/sql/init.sql` 以创建数据库和表。
    - 在 `mybatis-config.xml` 中修改数据库连接的相关配置。


3. **运行项目**：
   直接通过 IDEA 运行入口函数即可。  
   运行后，项目将连接 `homework` 数据库，查询 `student` 表中的所有记录，并在控制台输出，同时展示 MyBatis 的 SQL 日志信息。

## 许可证

本项目采用 MIT 许可证，详细信息请参见 [LICENSE](LICENSE) 文件。