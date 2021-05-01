FROM mysql:5.7

ENV MYSQL_DATABASE=kotlin_sample_app \
  MYSQL_USER=username \
  MYSQL_PASSWORD=password \
  MYSQL_ROOT_PASSWORD=password \
  TZ=Asia/Tokyo

COPY ./conf.d/my.cnf /etc/mysql/conf.d/my.cnf
RUN chmod 644 /etc/mysql/conf.d/my.cnf