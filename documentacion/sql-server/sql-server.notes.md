# Configurar sql-server
## Referencias

* https://faztweb.com/contenido/docker-microsoft-sql-server#google_vignette
* https://www.youtube.com/watch?v=Z6d5AhagDwc

## Imagen - Con Docker
```
docker pull mcr.microsoft.com/mssql/server:2022-latest
```

## Instalacion - Con Docker (funciono!!)
```
docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=Edibus@3130" -p 1433:1433 -d --name sqlserver-dev  mcr.microsoft.com/mssql/server:2022-latest

```

## copiar bd a docker

* path donde esta el .bak  de la BBDD
* ejecutar comando

```
docker cp G:\ISO\MDMQ_CORE_TRIBUTARIO.bak c1475a28dc9c:/var/opt/mssql/data

```

https://stackoverflow.com/questions/70946140/docker-desktop-wsl-ext4-vhdx-too-large
https://www.jormc.es/2023/04/18/docker-windows-crecimiento-de-disco-incontrolado/
https://enriquecatala.com/2021/04/14/Libera-espacio-del-fichero-ext4.vhdx.html


Optimize-VHD -Path c:\Users\<your_username>\AppData\Local\Docker\wsl\data\ext4.vhdx -Mode Full  

Optimize-VHD -Path c:\Users\ebustillos\AppData\Local\Docker\wsl\data\ext4.vhdx -Mode Full  	

Windows PowerShell
Copyright (C) Microsoft Corporation. Todos los derechos reservados.
Instale la versión más reciente de PowerShell para obtener nuevas características y mejoras. https://aka.ms/PSWindows                                                                                                                           

PS C:\WINDOWS\system32> cd C:\Users\ebustillos\AppData\Local\Docker\wsl\data
PS C:\Users\<user>\AppData\Local\Docker\wsl\data> wsl --update
Comprobando actualizaciones.
La versión más reciente de Subsistema de Windows para Linux ya está instalada.
C:\Users\<user>\AppData\Local\Docker\wsl\data\
PS C:\Users\<user>\AppData\Local\Docker\wsl\data> optimize-vhd -Path .\ext4.vhdx -Mode full



docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=123456" -p 1433:1433 -d --name sqlserver-dev  mcr.microsoft.com/mssql/server:2022-latest

docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=Edibus@3130" -p 1433:1433 -d --name sqlserver-dev  mcr.microsoft.com/mssql/server:2022-latest

docker cp D:\Tesis\MDMQ_CORE_TRIBUTARIO.bak 7a61845e33cc:/var/opt/mssql/data