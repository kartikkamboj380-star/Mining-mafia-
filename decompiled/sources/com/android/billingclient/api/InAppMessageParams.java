package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f12467a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f12468a = new HashSet();

        @NonNull
        public Builder addAllInAppMessageCategoriesToShow() {
            this.f12468a.add(2);
            return this;
        }

        @NonNull
        public Builder addInAppMessageCategoryToShow(int i10) {
            this.f12468a.add(Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public InAppMessageParams build() {
            return new InAppMessageParams(this.f12468a, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    /* synthetic */ InAppMessageParams(Set set, zzcn zzcnVar) {
        this.f12467a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    final ArrayList a() {
        return this.f12467a;
    }
}
