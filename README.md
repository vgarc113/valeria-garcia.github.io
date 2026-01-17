## Branch Overview

- main: Stable production
- dev: Integration branch for features
- feature1: Adds X functionality
- feature2: Adds Y functionality
- feature3: Adds hint system
- hotfix: Critical production fix

## Git Workflow Reflection

What I learned about merge, rebase, squash, and cherry-pick

Merge: Combines branches and keeps all the little commits. Handy when you don’t care about making history super clean.
Rebase: Moves your commits on top of another branch, so history looks linear. Good for cleaning up before merging into dev.
Squash: Smashes multiple commits into one. Perfect when your feature branch has a bunch of messy "fix typo" or "oops" commits.
Cherry-pick: Grabs one specific commit from another branch. Super useful for hotfixes without bringing in extra stuff.

What I noticed in this project

Feature1: History was simple, no big deal.
Feature2: Got a little messy with conflicts and lots of small commits.
Feature3: Squashing before merging kept dev nice and clean. Only one commit showed the whole feature, which made the history easy to read.

When I’d use these in real life

Merge: When you just want to combine branches without rewriting history. Team projects are perfect for this.
Rebase: Before merging a feature branch so the main branch stays linear. Makes history easier to follow.
Squash: When your feature branch has lots of tiny, messy commits. Makes dev look clean.
Cherry-pick: When you need to apply a single hotfix without touching other ongoing work.

