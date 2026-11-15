package T;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcelable f5540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5539b = new C0081a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: T.a$a, reason: collision with other inner class name */
    class C0081a extends a {
        C0081a() {
            super((C0081a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f5539b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(C0081a c0081a) {
        this();
    }

    public final Parcelable a() {
        return this.f5540a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5540a, i10);
    }

    private a() {
        this.f5540a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f5540a = parcelable == f5539b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f5540a = parcelable == null ? f5539b : parcelable;
    }
}
