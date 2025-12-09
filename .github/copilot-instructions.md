**Purpose**: Brief instructions to help AI coding agents be productive in this repository of Java example programs.

**Repository Big Picture**
- **What this repo is**: A collection of small, standalone Java example programs grouped by topic (e.g., `Arrays/`, `Methods/`, `Inheritance/`). Files generally live in the default (no) package and are intended to be compiled and run as single-class examples.
- **Why it is structured this way**: Each directory illustrates a Java concept with one or more classes. Files are named to match public classes (e.g., `Hello World/Hello.java` -> `Hello`), and many examples assume being run from their directory or compiled individually.

**Key directories / example files**
- `Hello World/Hello.java` — simple entry-point example.
- `Arrays/Arrays.java`, `Arrays/Arrayofobj.java` — array examples.
- `Methods/Methods.java`, `Methods/MethodOverloading.java` — method patterns.
- `Packages/UserDefine/B.java` — shows a user-defined package example under `Packages/UserDefine`.
- `Static keyword/Static_Methods.java` — shows static usage and directories with spaces (note quoting requirements).

**Build / run / debug workflows (PowerShell on Windows)**
- Compile a single example (recommended to avoid classpath collisions):

  ```powershell
  javac "Arrays\Arrays.java"
  java -cp . Arrays
  ```

- Compile all `.java` files recursively from the workspace root:

  ```powershell
  Get-ChildItem -Recurse -Filter *.java | ForEach-Object { javac $_.FullName }
  ```

- When running `java` for classes in the default package, `-cp .` and the simple class name are used; if you `cd` into a folder containing the class, `java ClassName` works too.
- Use quoting for paths that contain spaces or special characters, for example: `javac "Class & Object's\Basic_Object.java"`.

**Project-specific patterns & conventions**
- Most source files are in the default package (no `package` statement). Avoid adding package declarations unless you update file locations and run/build guidance accordingly.
- Filenames match public class names. Do not rename files without renaming the contained public class.
- Directory names include spaces and punctuation (e.g., `Hello World`, `Class & Object's`, `Static keyword`) — always quote paths in shell commands.
- Examples are intentionally small and often standalone; changes should preserve single-file runnable behavior where possible.

**Editing and refactoring guidance for AI agents**
- Prefer small, local edits: update or fix one example at a time and verify it still compiles.
- If introducing packages, update the file path and the `package` line together; then compile with the correct classpath root and run using the fully-qualified class name.
- Avoid moving multiple classes into the same package without verifying there are no duplicate class names across the workspace.

**No automated tests found**
- There are no test frameworks or CI config files detected. Validate changes by compiling the modified file(s) locally using the compile examples above.

**Common pitfalls to watch for**
- Duplicate class names in different directories — compiling all files into the same directory can cause conflicts. Prefer per-folder compilation for examples.
- Many files assume `main` exists; if `javac` succeeds but `java` fails with `NoClassDefFoundError` or `Could not find or load main class`, check package declarations and current working directory.

**When adding new examples**
- Keep the example self-contained and named to match the public class.
- If you must add a package, use folders that mirror the package name and update the README (if present) describing how to compile/run the new package.

**Files to inspect for more patterns**
- `Packages/UserDefine/B.java` (user-defined package example)
- `Static keyword/Static_Methods.java` (shows naming and static patterns)
- `Abstract/Abstract.java` (abstract class usage)

If anything in this file is unclear or you'd like examples expanded (e.g., exact compile/run commands for a specific folder), tell me which example(s) and I'll update this file.
