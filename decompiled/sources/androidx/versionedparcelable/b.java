package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f11145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f11146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f11148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f11149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11152k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p190t.a(), new p190t.a(), new p190t.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f11146e.writeInt(-1);
        } else {
            this.f11146e.writeInt(bArr.length);
            this.f11146e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f11146e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f11146e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f11146e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f11146e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f11150i;
        if (i10 >= 0) {
            int i11 = this.f11145d.get(i10);
            int iDataPosition = this.f11146e.dataPosition();
            this.f11146e.setDataPosition(i11);
            this.f11146e.writeInt(iDataPosition - i11);
            this.f11146e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f11146e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f11151j;
        if (i10 == this.f11147f) {
            i10 = this.f11148g;
        }
        return new b(parcel, iDataPosition, i10, this.f11149h + "  ", this.f11142a, this.f11143b, this.f11144c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f11146e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i10 = this.f11146e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f11146e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f11146e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f11151j < this.f11148g) {
            int i11 = this.f11152k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f11146e.setDataPosition(this.f11151j);
            int i12 = this.f11146e.readInt();
            this.f11152k = this.f11146e.readInt();
            this.f11151j += i12;
        }
        return this.f11152k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f11146e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f11146e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f11146e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f11150i = i10;
        this.f11145d.put(i10, this.f11146e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z9) {
        this.f11146e.writeInt(z9 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, p190t.a aVar, p190t.a aVar2, p190t.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f11145d = new SparseIntArray();
        this.f11150i = -1;
        this.f11152k = -1;
        this.f11146e = parcel;
        this.f11147f = i10;
        this.f11148g = i11;
        this.f11151j = i10;
        this.f11149h = str;
    }
}
