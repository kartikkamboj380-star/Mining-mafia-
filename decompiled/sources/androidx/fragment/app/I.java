package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f9870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList f9871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C1131b[] f9872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f9873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f9874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f9875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f9876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList f9877h;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public I createFromParcel(Parcel parcel) {
            return new I(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public I[] newArray(int i10) {
            return new I[i10];
        }
    }

    public I() {
        this.f9874e = null;
        this.f9875f = new ArrayList();
        this.f9876g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f9870a);
        parcel.writeStringList(this.f9871b);
        parcel.writeTypedArray(this.f9872c, i10);
        parcel.writeInt(this.f9873d);
        parcel.writeString(this.f9874e);
        parcel.writeStringList(this.f9875f);
        parcel.writeTypedList(this.f9876g);
        parcel.writeTypedList(this.f9877h);
    }

    public I(Parcel parcel) {
        this.f9874e = null;
        this.f9875f = new ArrayList();
        this.f9876g = new ArrayList();
        this.f9870a = parcel.createStringArrayList();
        this.f9871b = parcel.createStringArrayList();
        this.f9872c = (C1131b[]) parcel.createTypedArray(C1131b.CREATOR);
        this.f9873d = parcel.readInt();
        this.f9874e = parcel.readString();
        this.f9875f = parcel.createStringArrayList();
        this.f9876g = parcel.createTypedArrayList(C1132c.CREATOR);
        this.f9877h = parcel.createTypedArrayList(G.l.CREATOR);
    }
}
