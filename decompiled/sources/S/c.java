package S;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f5343k;

    public c(Context context, int i10, Cursor cursor, boolean z9) {
        super(context, cursor, z9);
        this.f5342j = i10;
        this.f5341i = i10;
        this.f5343k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // S.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f5343k.inflate(this.f5342j, viewGroup, false);
    }

    @Override // S.a
    public View k(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f5343k.inflate(this.f5341i, viewGroup, false);
    }
}
