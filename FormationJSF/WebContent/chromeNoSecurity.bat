echo Arr�t de Chrome
pause
taskkill /f /im chrome.exe
pause
echo Red�marrage de Chrome de s�curit� d�grad�
"C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" --disable-web-security --allow-file-access-from-files
pause