#!/bin/bash
cnt=1
while [ $cnt -lt 10000 ]
do
	echo $cnt
#	date +%H:%M:%S:%N>> stat1.json
	docker stats --no-stream --format "{\"container\":\"{{ .Container }}\",\"memory\":{\"raw\":\"{{ .MemUsage }}\",\"percent\":\"{{ .MemPerc }}\"},\"cpu\":\"{{ .CPUPerc }}\"}" >> stat1.json
	sleep 1
	((cnt++))
done
