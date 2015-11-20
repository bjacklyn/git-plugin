package hudson.plugins.git.util.AncestryBuildChooser;

def f = namespace(lib.FormTagLib);

f.entry() {
    f.dropdownDescriptorSelector(title:_("Strategy"), field:"buildChooser",
            descriptors: descriptor.getBuildChooserDescriptors())
}

f.description {
    raw(_("maximum_age_of_commit_blurb"))
}

f.entry(title:_("Maximum Age of Commit"), field:"maximumAgeInDays") {
    f.textbox()
}

f.description {
    raw(_("commit_in_ancestry_blurb"))
}

f.entry(title:_("Commit in Ancestry"), field:"ancestorCommitSha1") {
    f.textbox()
}

f.description {
    raw(_("prioritized_branches_blurb"))
}

f.entry(title:_("Prioritized Branches"), field:"prioritizedBranches") {
    f.expandableTextbox()
}
