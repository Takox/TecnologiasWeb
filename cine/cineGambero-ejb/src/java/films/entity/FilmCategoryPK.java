/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author alumno
 */
@Embeddable
public class FilmCategoryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "FILM_ID")
    private short filmId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CATEGORY_ID")
    private short categoryId;

    public FilmCategoryPK() {
    }

    public FilmCategoryPK(short filmId, short categoryId) {
        this.filmId = filmId;
        this.categoryId = categoryId;
    }

    public short getFilmId() {
        return filmId;
    }

    public void setFilmId(short filmId) {
        this.filmId = filmId;
    }

    public short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(short categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) filmId;
        hash += (int) categoryId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmCategoryPK)) {
            return false;
        }
        FilmCategoryPK other = (FilmCategoryPK) object;
        if (this.filmId != other.filmId) {
            return false;
        }
        if (this.categoryId != other.categoryId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "films.entity.FilmCategoryPK[ filmId=" + filmId + ", categoryId=" + categoryId + " ]";
    }
    
}
