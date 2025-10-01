[Unit]
Description=relay server client
After=systemd-update-utmp.service

[Service]
User=hsqmmanager
RemainAfterExit=no
Type=simple
ExecStart=/home/hsqmmanager/.pyenv/versions/3.8.18/bin/python /home/hsqmmanager/relay_server_client/main.py
Restart=on-success

[Install]
WantedBy=default.target
