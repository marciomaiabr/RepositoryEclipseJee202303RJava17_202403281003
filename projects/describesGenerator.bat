cls
del describes.txt
for /D %%J in (".\*") do (
  echo %%J >> describes.txt
  more %%J\describe.txt >> describes.txt
  dir /b /s %%J\target\classes\*.class >> describes.txt
  echo - >> describes.txt
)
start "" "describes.txt"
close
