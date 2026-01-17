## Branch Overview

- main: Stable production
- dev: Integration branch for features
- feature1: Adds X functionality
- feature2: Adds Y functionality
- feature3: Adds hint system
- hotfix: Critical production fix

## Git Workflow Reflection

Differences between strategies

- Merge: preserves full history, may introduce merge commits
- Rebase: rewrites history to be linear
- Squash: combines multiple commits into one clean commit
- Cherry-pick: applies a single commit to another branch

What you observed

- Feature1: messy history due to direct merges
- Feature2: cleaner but still shows conflict resolution commits
- Feature3: cleanest history due to squashing before merge

When to use each

- Merge: collaborative work with shared history
- Rebase: clean up local feature branches
- Squash: finalize features before merging into dev
- Cherry-pick: apply urgent hotfixes without pulling unrelated changes