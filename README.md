# PokerHandApplication

**System requirements**

  - Linux
  - Java
  - You don't need Maven. The project makes use of a Maven wrapper (https://www.baeldung.com/maven-wrapper) which installs the correct version of Maven.
  
**Build script**

  PokerHandApplication/run.sh
  
**Build script commands**

```
./run.sh
./run.sh test
```

**Troubleshooting**

The first run might take a while to complete due to downloading dependencies and completing the `package` build phase.
If you encounter a permission error when executing the run script, you just need to give the script file the correct permissions by running `chmod`
```
bash: ./run.sh: Permission denied
```
Resolution
```
chmod +rwx run.sh
```
