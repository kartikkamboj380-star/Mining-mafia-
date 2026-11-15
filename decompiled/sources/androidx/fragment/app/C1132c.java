package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1132c implements Parcelable {
    public static final Parcelable.Creator<C1132c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f10022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f10023b;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1132c createFromParcel(Parcel parcel) {
            return new C1132c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1132c[] newArray(int i10) {
            return new C1132c[i10];
        }
    }

    C1132c(Parcel parcel) {
        this.f10022a = parcel.createStringArrayList();
        this.f10023b = parcel.createTypedArrayList(C1131b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f10022a);
        parcel.writeTypedList(this.f10023b);
    }
}
