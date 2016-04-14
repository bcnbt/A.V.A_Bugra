#!/bin/bash
#say.sh (customized espeak)
espeak -k20 -s150 "$1" --stdout | aplay > /dev/null 2>&1
exitwww.