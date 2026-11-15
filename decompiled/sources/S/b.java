package S;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
class b extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f5340a;

    interface a {
        void b(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor e(CharSequence charSequence);

        Cursor f();
    }

    b(a aVar) {
        this.f5340a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f5340a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorE = this.f5340a.e(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorE != null) {
            filterResults.count = cursorE.getCount();
            filterResults.values = cursorE;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorF = this.f5340a.f();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorF) {
            return;
        }
        this.f5340a.b((Cursor) obj);
    }
}
