# Computer

The ```Http Client``` project contains the common re-usable components.

****
Power of 2
---

> 2<sup>0</sup> = 1
> 2<sup>1</sup> = 1
> 2<sup>2</sup> = 1

> 2 ^ 1 = 2
> 2 ^ 2 = 4
> 2 ^ 3 = 8
> 2 ^ 4 = 16
> 2 ^ 5 = 32
> 2 ^ 6 = 64
> 2 ^ 7 = 128
> 2 ^ 8 = 256
> 2 ^ 9 = 512
> 2 ^ 10 = 1024
> 2 ^ 11 = 2048
> 2 ^ 12 = 4096
> ```

## 1. Topics

> ```
>   git clone https://github.com/rslakra/AppSuite.git
> ```

## 2. Fibonacci Series

>  F(n) = F<sub>(n-1)</sub> + F<sub>(n-2)</sub> for n > 2; if F<sub>0</sub>=1, F<sub>1</sub>=1


> ```
> F<sub>(K+1)</sub>/F<sub>(K)</sub> where k is
> 0 = (0+1)/0 = 1/0 = 0
> 1 = (1+1)/1 = 2/1 = 1
> 2 = (2+1)/2 = 3/2 = 1
> 3 = (3+1)/3 = 4/3 = 1
> ...
> (-1)<sup>h</sup> = (-1)^h = F(n+1) F(n-1) - F(n^2)
> ```

## 2.1. Time Complexity
- Approach 1: Looping/Iteration
> ```
>  O(N)
> ```

- Approach 2: Recursion
> ```
>  O(log N)
> ```

- Approach 2: Recursion with memoization
> ```
>  O(M(N) log N)
> ```


#### 3. Run the program

Run the program with the following command
  
>   ```./run.sh```

## Create MySQL User

- Login to MySQL with ```root``` user
```shell
mysql -u root -p
```

- Create new User
```shell
USE mysql;
CREATE USER 'user'@'localhost' IDENTIFIED BY 'P@ssW0rd';
GRANT ALL ON *.* TO 'user'@'localhost';
FLUSH PRIVILEGES;
```

OR
```shell
USE mysql;
CREATE USER 'sql-user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON *.* TO 'sql-user'@'localhost';
FLUSH PRIVILEGES;
```

- Login with new User
```shell
mysql -u sql-user -ppassword
```

## To Login Automatically to MySQL
```shell
rlakra@C02XG1R2JGH8 ~ % cat /usr/local/etc/my.cnf   
# Default Homebrew MySQL server config
[client]
# The following password is sent to all standard MySQL clients
user=root
password=


[mysqld]
port=3306
socket=/tmp/mysql.sock

# Only allow connections from localhost
bind-address = 127.0.0.1
mysqlx-bind-address = 127.0.0.1
```


## Built With

* [Java](https://www.java.com/en/download/mac_download.jsp) - The Java Download Location
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Rohtash Lakra** - [Core](https://github.com/rslakra/AppSuite.git/Core)


See also the list of [contributors](https://github.com/rslakra/AppSuite.git/contributors) who participated in 
this project.
