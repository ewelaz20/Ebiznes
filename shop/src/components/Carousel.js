import React, { Component } from "react";
import RBCarousel from "react-bootstrap-carousel";
import { Row, Col} from "./bootstrap-component.jsx";
import "react-bootstrap-carousel/dist/react-bootstrap-carousel.css";

import slider1 from '../images/slider/slider1.jpg';
import slider2 from '../images/slider/slider2.jpg';
import slider3 from '../images/slider/slide3.jpg';
import slider4 from '../images/slider/slider4.jpg';


export default class Carousel extends Component {
  constructor(props) {
    super(props);
    this.slider = React.createRef();
    this.state = {
      autoplay: true,
    };
  }
  _onSelect = (active, direction) => {
    console.log(`active=${active} && direction=${direction}`);
  };
  render() {
    return (
      <div className="container-fluid" style={{ paddingBottom: 20 }}>
        <Row>
         
          <Col span={12} style={{ marginTop: 20 }}>
            <RBCarousel
              animation={true}
              autoplay={this.state.autoplay}
              slideshowSpeed={2000}
              defaultActiveIndex={0}
              
              onSelect={this._onSelect}
              ref={this.slider}
              version={4}
            >
              
              <div >
               
                <img style={{ width: "90%", height: "100%" }} src = {slider1}/>
              </div>
              <div >
              <img style={{ width: "90%", height: "100%" }} src = {slider2}/>
              </div>
              <div >
              <img style={{ width: "90%", height: "100%" }} src = {slider3}/>
              </div>
              <div >
              <img style={{ width: "90%", height: "100%" }} src = {slider4}/>
              </div>
              
            </RBCarousel>
          </Col>
         
        </Row>
      </div>
    );
  }
}
