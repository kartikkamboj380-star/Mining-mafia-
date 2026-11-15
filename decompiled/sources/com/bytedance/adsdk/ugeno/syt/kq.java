package com.bytedance.adsdk.ugeno.syt;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq implements Parcelable {
    private final Parcelable oq;
    public static final kq kq = new kq() { // from class: com.bytedance.adsdk.ugeno.syt.kq.1
    };
    public static final Parcelable.Creator<kq> CREATOR = new Parcelable.ClassLoaderCreator<kq>() { // from class: com.bytedance.adsdk.ugeno.syt.kq.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public kq createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public kq createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return kq.kq;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public kq[] newArray(int i10) {
            return new kq[i10];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable kq() {
        return this.oq;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.oq, i10);
    }

    private kq() {
        this.oq = null;
    }

    protected kq(Parcelable parcelable) {
        if (parcelable != null) {
            this.oq = parcelable == kq ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected kq(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.oq = parcelable == null ? kq : parcelable;
    }
}
