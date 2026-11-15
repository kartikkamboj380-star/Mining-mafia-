package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FilterWord {
    private boolean bob;
    private List<FilterWord> fou;
    private String kq;
    private String oq;

    public FilterWord(String str, String str2) {
        this.kq = str;
        this.oq = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.fou == null) {
            this.fou = new ArrayList();
        }
        this.fou.add(filterWord);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.kq;
    }

    public boolean getIsSelected() {
        return this.bob;
    }

    public String getName() {
        return this.oq;
    }

    public List<FilterWord> getOptions() {
        return this.fou;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.fou;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.kq) || TextUtils.isEmpty(this.oq)) ? false : true;
    }

    public void setId(String str) {
        this.kq = str;
    }

    public void setIsSelected(boolean z9) {
        this.bob = z9;
    }

    public void setName(String str) {
        this.oq = str;
    }

    public FilterWord() {
    }
}
