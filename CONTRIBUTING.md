# 🤝 Contributing to DSA Journey

First off, thanks for taking the time to contribute! 🎉 

This repository is a community effort to create the most comprehensive DSA learning resource. Your contributions help thousands of students and developers worldwide.

## 📋 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
- [Getting Started](#getting-started)
- [Contribution Guidelines](#contribution-guidelines)
- [Style Guide](#style-guide)
- [Pull Request Process](#pull-request-process)
- [Issue Guidelines](#issue-guidelines)
- [Recognition](#recognition)

## 📜 Code of Conduct

This project adheres to our [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code. Please report unacceptable behavior to the project maintainers.

## 🎯 How Can I Contribute?

### 🐛 Reporting Bugs
- **Check existing issues** first to avoid duplicates
- **Use the bug report template** when creating new issues
- **Include detailed information**: Java version, OS, error messages
- **Provide minimal reproducible examples**

### 💡 Suggesting Features
- **Search existing feature requests** before creating new ones
- **Use the feature request template**
- **Explain the use case** and potential benefits
- **Consider backward compatibility**

### 📝 Improving Documentation
- **Fix typos or grammatical errors**
- **Add missing documentation** for complex algorithms
- **Improve code comments** and explanations
- **Create or update README sections**

### 💻 Code Contributions
- **Bug fixes** for existing solutions
- **Algorithm optimizations** with better time/space complexity
- **New LeetCode solutions** following our naming convention
- **Alternative approaches** to existing problems
- **Test cases** for edge scenarios

### 📚 Adding Notes
- **Handwritten notes** for new topics (scan as high-quality PDFs)
- **Diagrams and visualizations** for complex algorithms
- **Step-by-step explanations** for difficult concepts

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Git
- Basic understanding of DSA concepts
- Familiarity with GitHub workflow

### Setup Development Environment

1. **Fork the repository**
   ```bash
   # Click the 'Fork' button on GitHub
   ```

2. **Clone your fork**
   ```bash
   git clone https://github.com/YOUR_USERNAME/DSA-Journey-Notes-and-Programs.git
   cd DSA-Journey-Notes-and-Programs
   ```

3. **Add upstream remote**
   ```bash
   git remote add upstream https://github.com/Chandrakant-Mane/DSA-Journey-Notes-and-Programs.git
   ```

4. **Create a new branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

## 📐 Contribution Guidelines

### 🎯 Types of Contributions

#### **New LeetCode Solutions**
- **File naming**: `leetCodeQ{number}.java` (e.g., `leetCodeQ1.java`)
- **Alternative solutions**: `leetCodeQ{number}M2.java`, `leetCodeQ{number}Opt.java`
- **Include problem link** in comments
- **Multiple approaches** when possible

#### **Algorithm Implementations**
- **Clear, readable code** with proper indentation
- **Comprehensive comments** explaining logic
- **Time and space complexity** analysis
- **Example usage** in main method

#### **Documentation Updates**
- **Consistent formatting** with existing style
- **Accurate information** verified through testing
- **Clear explanations** suitable for beginners

### 🏗️ Code Quality Standards

#### **Java Code Style**
```java
// ✅ Good Example
package arrays;

/**
 * LeetCode #1: Two Sum
 * https://leetcode.com/problems/two-sum/
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class leetCodeQ1 {
    
    /**
     * Finds two numbers that add up to target
     * @param nums Array of integers
     * @param target Target sum
     * @return Indices of the two numbers
     */
    public int[] twoSum(int[] nums, int target) {
        // Implementation with clear comments
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        // Test cases demonstrating usage
        leetCodeQ1 solution = new leetCodeQ1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
```

#### **Required Elements**
- [ ] **Package declaration** matching folder structure
- [ ] **Class documentation** with problem description and complexity
- [ ] **Method documentation** with parameters and return values
- [ ] **Inline comments** for complex logic
- [ ] **Test cases** in main method
- [ ] **Proper error handling** where applicable

### 📁 File Organization

```
Topic Folder/
├── basicImplementation.java        # Basic concept implementation
├── leetCodeQ123.java              # Primary LeetCode solution
├── leetCodeQ123M2.java            # Alternative approach
├── leetCodeQ123Opt.java           # Optimized solution
├── practiceQ1.java                # Additional practice problems
└── README.md                      # Topic-specific documentation
```

### 🧪 Testing Requirements

- **All code must compile** without errors
- **Include test cases** covering:
  - Normal inputs
  - Edge cases (empty, null, single element)
  - Boundary conditions
  - Large inputs (where applicable)
- **Verify output** matches expected results

## 🔄 Pull Request Process

### 1. **Prepare Your Changes**
```bash
# Sync with upstream
git fetch upstream
git checkout main
git merge upstream/main

# Create feature branch
git checkout -b feature/add-binary-search-solutions
```

### 2. **Make Your Changes**
- Follow the style guide
- Add comprehensive comments
- Include test cases
- Update documentation if needed

### 3. **Test Your Changes**
```bash
# Compile all modified Java files
javac *.java

# Run test cases
java YourClassName
```

### 4. **Commit Your Changes**
```bash
# Stage changes
git add .

# Commit with descriptive message
git commit -m "feat: add optimized binary search solutions

- Add leetCodeQ33.java for rotated array search
- Include O(log n) solution with detailed comments
- Add comprehensive test cases for edge scenarios"
```

### 5. **Push and Create PR**
```bash
# Push to your fork
git push origin feature/add-binary-search-solutions

# Create PR on GitHub with detailed description
```

### 🎨 PR Template

Use this template for your pull request description:

```markdown
## 🎯 Description
Brief description of changes made

## 📋 Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Documentation update
- [ ] Performance improvement
- [ ] Code refactoring

## 🧪 Testing
- [ ] All code compiles successfully
- [ ] Test cases pass
- [ ] Edge cases covered

## 📚 Related Issues
Closes #(issue_number)

## 📝 Additional Notes
Any additional information or context
```

## 🐛 Issue Guidelines

### 🔍 Before Creating an Issue

1. **Search existing issues** for similar problems
2. **Check closed issues** for previous solutions
3. **Verify the bug** with latest code
4. **Gather necessary information**

### 📝 Issue Templates

#### **Bug Report**
```markdown
**Description**
Clear description of the bug

**To Reproduce**
Steps to reproduce the behavior

**Expected Behavior**
What you expected to happen

**Environment**
- Java Version:
- OS:
- IDE:

**Additional Context**
Screenshots, error logs, etc.
```

#### **Feature Request**
```markdown
**Problem Statement**
What problem does this solve?

**Proposed Solution**
Describe your solution

**Alternatives Considered**
Other approaches you've considered

**Additional Context**
Use cases, examples, etc.
```

## 🏆 Recognition

### 🌟 Contributors Hall of Fame

Contributors are recognized in several ways:

- **README Credits**: Regular contributors mentioned in README
- **Release Notes**: Significant contributions highlighted in releases
- **Contributor Badge**: Special recognition for outstanding contributions
- **Mentorship Opportunities**: Active contributors invited to review PRs

### 📊 Contribution Metrics

We track and celebrate:
- Number of problems solved
- Code quality improvements
- Documentation enhancements
- Community engagement
- Mentorship activities

## 🆘 Getting Help

### 📞 Support Channels

- **GitHub Issues**: Technical questions and bug reports
- **GitHub Discussions**: General questions and community chat
- **Code Reviews**: Get feedback on your contributions

### 📚 Resources

- [Java Documentation](https://docs.oracle.com/en/java/)
- [LeetCode](https://leetcode.com/) - Problem source
- [Big O Cheat Sheet](https://www.bigocheatsheet.com/) - Complexity reference
- [GitHub Guides](https://guides.github.com/) - Git and GitHub help

## 📄 License

By contributing to this project, you agree that your contributions will be licensed under the MIT License.

---

## 🙏 Thank You!

Every contribution, no matter how small, makes this project better for the entire community. Your efforts help students and developers worldwide learn and grow.

**Happy Contributing! 🚀**

---

*For questions about contributing, please open an issue or start a discussion. We're here to help!*