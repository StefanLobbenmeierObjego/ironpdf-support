FROM ironsoftwareofficial/ironpdfengine:2025.2.8
RUN apt update && apt install -y libnss3 libasound2 libatk1.0-0 libgbm1
RUN apt update && apt install -y chromium-browser-l10n hunspell hunspell-en-us hunspell-de-de
