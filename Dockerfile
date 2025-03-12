FROM ironsoftwareofficial/ironpdfengine:2025.2.8
RUN apt update && apt install -y hyphen-en-us hyphen-de hyphen-fr hyphen-es
