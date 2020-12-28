package com.heshmat.retrofitgithubapidemo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.heshmat.retrofitgithubapidemo.models.Owner;

public  class UserRepos {

    @Expose
    @SerializedName("owner")
    private Owner owner;

    @Expose
    @SerializedName("full_name")
    private String fullName;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("node_id")
    private String nodeId;
    @Expose
    @SerializedName("id")
    private int id;
    @Expose
    @SerializedName("default_branch")
    private String defaultBranch;
    @Expose
    @SerializedName("watchers")
    private int watchers;
    @Expose
    @SerializedName("open_issues")
    private int openIssues;
    @Expose
    @SerializedName("forks")
    private int forks;
    @Expose
    @SerializedName("open_issues_count")
    private int openIssuesCount;
    @Expose
    @SerializedName("disabled")
    private boolean disabled;
    @Expose
    @SerializedName("archived")
    private boolean archived;
    @Expose
    @SerializedName("forks_count")
    private int forksCount;
    @Expose
    @SerializedName("has_pages")
    private boolean hasPages;
    @Expose
    @SerializedName("has_wiki")
    private boolean hasWiki;
    @Expose
    @SerializedName("has_downloads")
    private boolean hasDownloads;
    @Expose
    @SerializedName("has_projects")
    private boolean hasProjects;
    @Expose
    @SerializedName("has_issues")
    private boolean hasIssues;
    @Expose
    @SerializedName("language")
    private String language;
    @Expose
    @SerializedName("watchers_count")
    private int watchersCount;
    @Expose
    @SerializedName("stargazers_count")
    private int stargazersCount;
    @Expose
    @SerializedName("size")
    private int size;
    @Expose
    @SerializedName("svn_url")
    private String svnUrl;
    @Expose
    @SerializedName("clone_url")
    private String cloneUrl;
    @Expose
    @SerializedName("ssh_url")
    private String sshUrl;
    @Expose
    @SerializedName("git_url")
    private String gitUrl;
    @Expose
    @SerializedName("pushed_at")
    private String pushedAt;
    @Expose
    @SerializedName("updated_at")
    private String updatedAt;
    @Expose
    @SerializedName("created_at")
    private String createdAt;
    @Expose
    @SerializedName("deployments_url")
    private String deploymentsUrl;
    @Expose
    @SerializedName("releases_url")
    private String releasesUrl;
    @Expose
    @SerializedName("labels_url")
    private String labelsUrl;
    @Expose
    @SerializedName("notifications_url")
    private String notificationsUrl;
    @Expose
    @SerializedName("milestones_url")
    private String milestonesUrl;
    @Expose
    @SerializedName("pulls_url")
    private String pullsUrl;
    @Expose
    @SerializedName("issues_url")
    private String issuesUrl;
    @Expose
    @SerializedName("downloads_url")
    private String downloadsUrl;
    @Expose
    @SerializedName("archive_url")
    private String archiveUrl;
    @Expose
    @SerializedName("merges_url")
    private String mergesUrl;
    @Expose
    @SerializedName("compare_url")
    private String compareUrl;
    @Expose
    @SerializedName("contents_url")
    private String contentsUrl;
    @Expose
    @SerializedName("issue_comment_url")
    private String issueCommentUrl;
    @Expose
    @SerializedName("comments_url")
    private String commentsUrl;
    @Expose
    @SerializedName("git_commits_url")
    private String gitCommitsUrl;
    @Expose
    @SerializedName("commits_url")
    private String commitsUrl;
    @Expose
    @SerializedName("subscription_url")
    private String subscriptionUrl;
    @Expose
    @SerializedName("subscribers_url")
    private String subscribersUrl;
    @Expose
    @SerializedName("contributors_url")
    private String contributorsUrl;
    @Expose
    @SerializedName("stargazers_url")
    private String stargazersUrl;
    @Expose
    @SerializedName("languages_url")
    private String languagesUrl;
    @Expose
    @SerializedName("statuses_url")
    private String statusesUrl;
    @Expose
    @SerializedName("trees_url")
    private String treesUrl;
    @Expose
    @SerializedName("git_refs_url")
    private String gitRefsUrl;
    @Expose
    @SerializedName("git_tags_url")
    private String gitTagsUrl;
    @Expose
    @SerializedName("blobs_url")
    private String blobsUrl;
    @Expose
    @SerializedName("tags_url")
    private String tagsUrl;
    @Expose
    @SerializedName("branches_url")
    private String branchesUrl;
    @Expose
    @SerializedName("assignees_url")
    private String assigneesUrl;
    @Expose
    @SerializedName("events_url")
    private String eventsUrl;
    @Expose
    @SerializedName("issue_events_url")
    private String issueEventsUrl;
    @Expose
    @SerializedName("hooks_url")
    private String hooksUrl;
    @Expose
    @SerializedName("teams_url")
    private String teamsUrl;
    @Expose
    @SerializedName("collaborators_url")
    private String collaboratorsUrl;
    @Expose
    @SerializedName("keys_url")
    private String keysUrl;
    @Expose
    @SerializedName("forks_url")
    private String forksUrl;
    @Expose
    @SerializedName("url")
    private String url;
    @Expose
    @SerializedName("fork")
    private boolean fork;
    @Expose
    @SerializedName("description")
    private String description;
    @Expose
    @SerializedName("html_url")
    private String htmlUrl;

    @Expose
    @SerializedName("private")
    private boolean isPrivate;//private;



    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(int openIssues) {
        this.openIssues = openIssues;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public int getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(int openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public int getForksCount() {
        return forksCount;
    }

    public void setForksCount(int forksCount) {
        this.forksCount = forksCount;
    }

    public boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(boolean hasPages) {
        this.hasPages = hasPages;
    }

    public boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(int watchersCount) {
        this.watchersCount = watchersCount;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean getFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        this.isPrivate = aPrivate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
