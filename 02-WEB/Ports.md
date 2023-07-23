# ports
In computer networking, a port is a communication endpoint. Ports are identified for each protocol and address combination by 16-bit unsigned numbers (0 to 65535), commonly known as the port number. The most common protocols that use port numbers are the Transmission Control Protocol (TCP) and the User Datagram Protocol (UDP). Specific port numbers are commonly reserved to identify specific services, so that an arriving packet can be easily forwarded to a running application.

## Port Number Ranges
There are three main port ranges (you don't have to learn the numbers, just be aware of the differences):

### System Ports range (0-1023)
Running an application on a System Port requires admin rights. Also, a request for using a System Port number must document both why using a port number from the Dynamic Ports range is unsuitable and why using a port number from the User Ports range is unsuitable for that application.

### User Ports range (1024-49151)
A documentation with request for using a User Port number must describe why a port number from the Dynamic Ports range is unsuitable.

### Dynamic Ports range (49152-65535)
These ports have been specifically set aside for local and dynamic use. Application software may simply use any dynamic port that is available on the local host, without any sort of assignment.

## Specific Port Numbers
Some ports are well-known to be used by specific services. Examples (don't worry, you don't need to know these by heart, but feel free to look up the abbreviations):

21 - FTP
22 - SSH
25 - SMTP
80 - HTTP
194 - IRC
389 - LDAP
443 - HTTPS
5432 - PostgresSQL
3306 - MySQL
You can use [this site](https://www.iana.org/assignments/service-names-port-numbers/service-names-port-numbers.xhtml) to check specific programs' or services' port usage.

## Deepen Your Knowledge
* Can a port be used by different protocols at the same time? Short answer: yes. [Long(er) answer](https://stackoverflow.com/questions/6437383/can-tcp-and-udp-sockets-use-the-same-port/6437427#6437427)
* [How to check whether a port is in use](https://www.cyberciti.biz/faq/unix-linux-check-if-port-is-in-use-command/)
* [About port forwarding](https://www.youtube.com/watch?v=2G1ueMDgwxw&ab_channel=PowerCertAnimatedVideos)