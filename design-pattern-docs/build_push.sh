rake build clean
rm -rf /Users/patrick/workspace/dooioo/svn_dooioo/automation/automationdocs-site/steps
mv build /Users/patrick/workspace/dooioo/svn_dooioo/automation/automationdocs-site/steps

cd /Users/patrick/workspace/dooioo/svn_dooioo/automation/automationdocs-site

git add .
git commit -m "update steps"

git push
