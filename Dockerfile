FROM ironsoftwareofficial/ironpdfengine:2025.3.6
RUN apt update && apt install -y hyphen-en-us hyphen-de hyphen-fr hyphen-es
