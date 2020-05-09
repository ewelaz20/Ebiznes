import React, { Component } from "react";

const Album = (props) => {
    return (
      <div className="column">
        <div className="box">
          <article className="media">
            <div className="media-left">
              <figure className="image is128x128">
                <img src={props.album.artworkUrl100}
                   alt="album cover" />
              </figure>
            </div>
            <div className="media-content">
              <div className="content">
                <p className="is-size-5">
                  <strong>
                    {props.album.collectionName}
                  </strong>
                </p>
              </div>
            </div>
          </article>
        </div>
      </div>
    )
  }
  
  export default Album;